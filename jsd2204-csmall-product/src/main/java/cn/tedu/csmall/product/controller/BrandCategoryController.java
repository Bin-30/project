package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.mapper.BrandCategoryMapper;
import cn.tedu.csmall.product.pojo.dto.BrandCategoryAddNewDTO;
import cn.tedu.csmall.product.service.BrandCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/brandCategories")
public class BrandCategoryController {
    @Autowired
    BrandCategoryService brandCategoryService;
    public BrandCategoryController() {
        log.debug("BrandCategoryController");
    }

    @RequestMapping("/add-new")
    public String addNew(BrandCategoryAddNewDTO brandCategoryAddNewDTO){
        brandCategoryService.addNew(brandCategoryAddNewDTO);
        return "添加成功";
    }

    @RequestMapping("/{id}/delete")
    public String deleteById(@PathVariable Long id){
        brandCategoryService.deleteById(id);
        return "删除成功";
    }
}
