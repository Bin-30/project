package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.pojo.dto.BrandAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Brand;
import cn.tedu.csmall.product.pojo.vo.BrandStandardVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
@SpringBootTest
public class BrandServiceTests {
    @Autowired
    IBrandService iBrandService;

    @Test
    void addNew(){
        BrandAddNewDTO brandAddNewDTO= new BrandAddNewDTO();
        brandAddNewDTO.setName("iu");
        brandAddNewDTO.setDescription("nice");
        brandAddNewDTO.setPinyin("iuiu");
        brandAddNewDTO.setLogo("***");
        try {
            iBrandService.addNew(brandAddNewDTO);
        }catch (ServiceException e){
            System.out.println(e);
        }
    }

    @Test
    void testDeleteById(){
        Long id = 3L;
        try{
            iBrandService.deleteById(id);
        }catch (ServiceException e){
            System.out.println(e);
        }

    }
}
