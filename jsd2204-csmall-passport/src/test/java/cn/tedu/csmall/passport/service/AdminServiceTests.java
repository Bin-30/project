package cn.tedu.csmall.passport.service;

import cn.tedu.csmall.passport.ex.ServiceException;
import cn.tedu.csmall.passport.mapper.AdminMapper;
import cn.tedu.csmall.passport.pojo.dto.AdminAddNewDTO;
import cn.tedu.csmall.passport.service.impl.AdminServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminServiceTests {
    @Autowired
    AdminServiceImpl adminService;

    @Test
    void testAddNew(){
        AdminAddNewDTO adminAddNewDTO = new AdminAddNewDTO();
        adminAddNewDTO.setUsername("bcrypt");
        adminAddNewDTO.setPassword("123456");
        adminAddNewDTO.setDescription("test");
        try {
            adminService.addNew(adminAddNewDTO);
        }catch (ServiceException e){
            System.out.println(e);
        }

    }
}
