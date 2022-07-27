package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Brand;
import cn.tedu.csmall.product.pojo.vo.BrandListItemVo;
import cn.tedu.csmall.product.pojo.vo.BrandStandardVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

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
    void testInsertBatch(){
        List<Brand> brands = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Brand brand = new Brand();
            brand.setName("name"+i);
            brand.setPinyin("pinyin"+i);
            brand.setLogo("asdad"+i);
            brands.add(brand);
        }
        brandMapper.insertBatch(brands);
        for (Brand brand : brands) {
            System.out.println(brand);
        }
    }

    @Test
    void testDeleteById(){
        Long id = 1L;
        int i = brandMapper.deleteById(id);
        System.out.println(i);
    }

    @Test
    void testDeleteByIds(){
        Long[] ids ={1L,2L};
        int i = brandMapper.deleteByIds(ids);
        System.out.println(i);
    }

    @Test
    void testUpdate() {
        Brand brand = new Brand();
        brand.setId(5L);
        brand.setName("华为");
        brand.setDescription("adadad");
        System.out.println("前"+brand);
        brandMapper.update(brand);
        System.out.println("后"+brand);
    }

    @Test
    void testSelect(){
        BrandStandardVo standardById = brandMapper.getStandardById(3L);
        System.out.println(standardById);
    }

    @Test
    void testList(){
        List<BrandListItemVo> list = brandMapper.list();
        for (BrandListItemVo itemvo : list) {
            System.out.println(itemvo);
        }

    }
    @Test
    void testCount(){
        int count = brandMapper.count();
        System.out.println(count);
    }
}
