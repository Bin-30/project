package cn.tedu.csmall.passport.controller;

import cn.tedu.csmall.passport.pojo.vo.RoleStandardVo;
import cn.tedu.csmall.passport.service.impl.RoleServiceImpl;
import cn.tedu.csmall.passport.web.JsonResult;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@Api(tags = "角色管理模块")
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    RoleServiceImpl roleService;

    @ApiOperation("查询角色列表")
    @ApiOperationSupport(order = 100)
    @GetMapping("/list")
    public JsonResult<List<RoleStandardVo>> list(){
        List<RoleStandardVo> list = roleService.list();
        return JsonResult.ok(list);
    }
}
