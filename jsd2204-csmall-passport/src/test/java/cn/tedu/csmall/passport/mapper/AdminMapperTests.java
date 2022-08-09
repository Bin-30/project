package cn.tedu.csmall.passport.mapper;

import cn.tedu.csmall.passport.pojo.entity.Admin;
import cn.tedu.csmall.passport.pojo.vo.AdminLoginInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AdminMapperTests {
    @Autowired
    AdminMapper adminMapper;

    @Test
    void testInsert(){
        Admin admin = new Admin();
        admin.setUsername("bin").setPassword("123").setNickname("curry");
        int i = adminMapper.insert(admin);
        System.out.println(i);
    }

    @Test
    void testCountByName(){
        int countByName = adminMapper.countByName("bin");
        System.out.println(countByName);
    }

    @Test
    void testSelectByName(){
        AdminLoginInfoVo adminLoginInfoVo = adminMapper.selectByName("root");
        System.out.println(adminLoginInfoVo);
    }

}
