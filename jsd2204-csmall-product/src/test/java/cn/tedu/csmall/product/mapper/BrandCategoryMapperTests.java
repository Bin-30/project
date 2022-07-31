package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Attribute;
import cn.tedu.csmall.product.pojo.entity.BrandCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BrandCategoryMapperTests {
    @Autowired
    BrandCategoryMapper mapper;

    @Test
    void testInsert() {
        BrandCategory brandCategory = new BrandCategory();
        brandCategory.setBrandId(2L);
        brandCategory.setCategoryId(2L);
        int i = mapper.insert(brandCategory);
        System.out.println(i);
    }

    @Test
    void testDeleteById(){
        Long id = 1l;
        int i = mapper.deleteById(id);
        System.out.println(i);
    }

}
