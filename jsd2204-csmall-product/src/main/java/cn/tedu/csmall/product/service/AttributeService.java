package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.pojo.dto.AttributeAddNewDTO;

public interface AttributeService {
    void addNew(AttributeAddNewDTO attributeAddNewDTO);

    void deleteById(Long id);
}
