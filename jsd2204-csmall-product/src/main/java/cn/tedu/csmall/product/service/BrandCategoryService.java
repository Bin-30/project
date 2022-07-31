package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.pojo.dto.BrandCategoryAddNewDTO;

public interface BrandCategoryService {
    void addNew(BrandCategoryAddNewDTO brandCategoryAddNewDTO);

    void deleteById(Long id);
}
