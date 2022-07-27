package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Album;
import cn.tedu.csmall.product.pojo.entity.Category;
import cn.tedu.csmall.product.pojo.vo.CategoryStandardVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CategoryMapperTests {
    @Autowired
    CategoryMapper mapper;

    @Test
    void testInsert() {
        Category category = new Category();
        category.setName("asdsadsa");
        category.setSort(5);
        int i = mapper.insert(category);
        System.out.println(i);
    }

    @Test
    void testDeleteById(){
        Long id = 1l;
        int i = mapper.deleteById(id);
        System.out.println(i);
    }

    @Test
    void testDeleteByIds(){
        List<Long> ids =new ArrayList<>();
        ids.add(1l);
        int i = mapper.deleteByIds(ids);
        System.out.println(i);
    }

    @Test
    void testUpdate() {
        Category category = new Category();
        category.setId(3);
        category.setSort(2);
        mapper.update(category);
        System.out.println("后"+category);
    }
    @Test
    void testCount(){
        int count = mapper.count();
        System.out.println(count);
    }

    @Test
    void testStandardById(){
       CategoryStandardVo standardById = mapper.getStandardById(3L);
       System.out.println(standardById);
    }


}
