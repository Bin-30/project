package cn.tedu.csmall.passport.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class AdminRoleMapperTests {
    @Autowired
    AdminRoleMapper adminRoleMapper;

    @Test
    void testInsert(){
        adminRoleMapper.insert(3,2);
    }
}
