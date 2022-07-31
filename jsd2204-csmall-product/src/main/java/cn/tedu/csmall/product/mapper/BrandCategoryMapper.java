package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.BrandCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandCategoryMapper {
    int insert(BrandCategory brandCategory);
    int deleteById(Long id);
    int countById(Long BId,Long CId);
    int countId(Long id);
}
