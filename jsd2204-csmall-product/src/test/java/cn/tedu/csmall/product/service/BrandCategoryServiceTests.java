package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.pojo.dto.BrandCategoryAddNewDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@Service
@SpringBootTest
public class BrandCategoryServiceTests {
    @Autowired
    BrandCategoryService brandCategoryService;

    @Test
    void testInsert(){
        try{
            BrandCategoryAddNewDTO brandCategoryAddNewDTO = new BrandCategoryAddNewDTO();
            brandCategoryAddNewDTO.setBrandId(9L);
            brandCategoryAddNewDTO.setCategoryId(8L);
            brandCategoryService.addNew(brandCategoryAddNewDTO);
        }catch (ServiceException e){
            System.out.println(e);
        }
    }

    @Test
    void testDeleteById(){
        try{
            brandCategoryService.deleteById(8L);
        }catch (ServiceException e){
            System.out.println(e);
        }
    }
}
