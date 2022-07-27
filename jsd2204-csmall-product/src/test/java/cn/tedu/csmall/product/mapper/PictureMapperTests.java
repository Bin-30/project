package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Attribute;
import cn.tedu.csmall.product.pojo.entity.Picture;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PictureMapperTests {
    @Autowired
    PictureMapper mapper;

    @Test
    void testInsert() {
        Picture picture = new Picture();
        picture.setSort(3);
        picture.setDescription("asdhals");
        int i = mapper.insert(picture);
        System.out.println(i);
    }

    @Test
    void testDeleteById(){
        Long id = 1l;
        int i = mapper.deleteById(id);
        System.out.println(i);
    }

}
