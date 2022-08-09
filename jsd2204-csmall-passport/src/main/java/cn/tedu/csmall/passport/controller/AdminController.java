package cn.tedu.csmall.passport.controller;

import cn.tedu.csmall.passport.mapper.AdminMapper;
import cn.tedu.csmall.passport.pojo.dto.AdminAddNewDTO;
import cn.tedu.csmall.passport.pojo.dto.AdminLoginDto;
import cn.tedu.csmall.passport.service.impl.AdminServiceImpl;
import cn.tedu.csmall.passport.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/admins")
@Api(tags = "管理员模块")
public class AdminController {
    @Autowired
    AdminServiceImpl adminService;

    @ApiOperation("管理员登录")
    @ApiOperationSupport(order = 50)
    @PostMapping("/login")
    public JsonResult<String> login(AdminLoginDto adminLoginDto){
        log.debug("{}",adminLoginDto);
        String jwt = adminService.login(adminLoginDto);
        return JsonResult.ok(jwt);
    }

    @ApiOperation("添加管理员")
    @ApiOperationSupport(order = 100)
    @PostMapping("/add-new")
    public JsonResult<Void> addNew(@Validated AdminAddNewDTO adminAddNewDTO){
        adminService.addNew(adminAddNewDTO);
        return JsonResult.ok();
    }

}
