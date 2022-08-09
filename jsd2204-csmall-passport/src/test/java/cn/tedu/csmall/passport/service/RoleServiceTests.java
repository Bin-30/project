package cn.tedu.csmall.passport.service;

import cn.tedu.csmall.passport.pojo.vo.RoleStandardVo;
import cn.tedu.csmall.passport.service.impl.RoleServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class RoleServiceTests {
    @Autowired
    RoleServiceImpl roleService;

    @Test
    void testList(){
        List<RoleStandardVo> list = roleService.list();
        System.out.println(list);
    }
}
