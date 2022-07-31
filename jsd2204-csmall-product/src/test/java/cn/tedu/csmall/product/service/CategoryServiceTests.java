package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.pojo.dto.CategoryAddNewDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class CategoryServiceTests {
    @Autowired
    CategoryService categoryService;

    @Test
    void testInsert(){
        CategoryAddNewDTO categoryAddNewDTO = new CategoryAddNewDTO();
        categoryAddNewDTO.setName("sddda");
        categoryAddNewDTO.setKeywords("haha");
        categoryAddNewDTO.setIsDisplay(2);
        categoryAddNewDTO.setIcon("uuuu");
        log.debug("对象：{}",categoryAddNewDTO);
        try{
            categoryService.addNew(categoryAddNewDTO);
        }catch (ServiceException e){
            System.out.println(e);
        }
    }

    @Test
    void testDeleteById(){
        try {
            categoryService.deleteById(10L);
        }catch (ServiceException e){
            System.out.println(e);
        }

    }
}
