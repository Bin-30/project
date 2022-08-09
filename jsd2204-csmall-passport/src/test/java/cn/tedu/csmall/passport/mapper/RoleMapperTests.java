package cn.tedu.csmall.passport.mapper;

import cn.tedu.csmall.passport.pojo.vo.RoleStandardVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class RoleMapperTests {
    @Autowired
    RoleMapper roleMapper;

    @Test
    void testList(){
        List<RoleStandardVo> list = roleMapper.list();
        System.out.println(list);
    }
}
