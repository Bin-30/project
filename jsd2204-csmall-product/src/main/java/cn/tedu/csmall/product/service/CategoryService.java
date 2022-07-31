package cn.tedu.csmall.product.service;

import cn.tedu.csmall.product.pojo.dto.CategoryAddNewDTO;
import cn.tedu.csmall.product.pojo.entity.Category;

public interface CategoryService {

    void addNew(CategoryAddNewDTO categoryAddNewDTO);

    void deleteById(Long id);
}
