package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.pojo.entity.Attribute;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AttributeMapperTests {
    @Autowired
    AttributeMapper mapper;

    @Test
    void testInsert() {
        Attribute attribute = new Attribute();
        attribute.setName("asdsadsa");
        attribute.setDescription("asdhals");
        int i = mapper.insert(attribute);
        System.out.println(i);
    }

    @Test
    void testDeleteById(){
        Long id = 1l;
        int i = mapper.deleteById(id);
        System.out.println(i);
    }

}
