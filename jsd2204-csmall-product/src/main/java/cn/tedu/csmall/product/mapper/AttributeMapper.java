package cn.tedu.csmall.product.mapper;

import cn.tedu.csmall.product.pojo.entity.Attribute;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeMapper {
    int insert(Attribute attribute);
    int deleteById(Long id);
    int countByName(String name);
    int countById(Long id);
}
