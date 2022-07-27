package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Attribute;
import cn.tedu.csmall.product.pojo.entity.AttributeTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AttributeTemplateMapperTests {
    @Autowired
    AttributeTemplateMapper mapper;

    @Test
    void testInsert() {
        AttributeTemplate attributeTemplate = new AttributeTemplate();
        attributeTemplate.setName("asdsadsa");
        attributeTemplate.setSort(8);
        int i = mapper.insert(attributeTemplate);
        System.out.println(i);
    }

    @Test
    void testDeleteById(){
        Long id = 1l;
        int i = mapper.deleteById(id);
        System.out.println(i);
    }

}
