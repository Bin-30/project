package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Brand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BrandMapperTests {
    @Autowired
    BrandMapper brandMapper;

    @Test
    void testInsert() {
        Brand brand = new Brand();
        brand.setName("小米");
        brand.setLogo("*");
        brand.setPinyin("小米");
        System.out.println("前"+brand);
        int i = brandMapper.insert(brand);
        System.out.println("后"+brand);
    }

    @Test
    void testDeleteById(){
        Long id = 1L;
        int i = brandMapper.deleteById(id);
        System.out.println(i);
    }

}
