package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.AttributeTemplate;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeTemplateMapper {
    int insert(AttributeTemplate attributeTemplate);
    int deleteById(Long id);
}
