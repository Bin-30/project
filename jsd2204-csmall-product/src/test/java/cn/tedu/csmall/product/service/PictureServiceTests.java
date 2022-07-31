package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.pojo.dto.PictureAddNewDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class PictureServiceTests {
    @Autowired
    PictureService pictureService;

    @Test
    void testInsert(){
        PictureAddNewDTO pictureAddNewDTO = new PictureAddNewDTO();
        pictureAddNewDTO.setDescription("dadasdsdasd");
        pictureAddNewDTO.setHeight(100);
        pictureAddNewDTO.setWidth(233);
        pictureAddNewDTO.setUrl("www.bin");
        try {
            pictureService.addNew(pictureAddNewDTO);
        }catch (ServiceException e){
            System.out.println(e);
        }

    }

    @Test
    void testDeleteById(){
        try {
            pictureService.deleteById(12L);
        }catch (ServiceException e){
            System.out.println(e);
        }

    }
}
