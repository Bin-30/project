package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.pojo.dto.AttributeAddNewDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class AttributeServiceTests {
    @Autowired
    AttributeService attributeService;
    @Test
    void addNewTest(){
        AttributeAddNewDTO attributeAddNewDTO = new AttributeAddNewDTO();
        attributeAddNewDTO.setName("bang");
        attributeAddNewDTO.setSort(2);
        attributeAddNewDTO.setDescription("wwww");
        try {
            attributeService.addNew(attributeAddNewDTO);
        }catch (ServiceException e){
            System.out.println(e);
        }
    }

    @Test
    void deleteByIdTests(){
        try {
            attributeService.deleteById(6L);
        }catch (ServiceException e){
            System.out.println(e);
        }
    }
}
