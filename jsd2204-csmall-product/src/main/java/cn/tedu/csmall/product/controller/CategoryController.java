package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.pojo.dto.CategoryAddNewDTO;
import cn.tedu.csmall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    public CategoryController() {
        log.debug("CategoryController");
    }

    @RequestMapping("/add-new")
    public String insert(@Validated CategoryAddNewDTO categoryAddNewDTO){
        categoryService.addNew(categoryAddNewDTO);
        return "添加成功";
    }

    @RequestMapping("/{id:[0-9]+}/delete")
    public String deleteById(@PathVariable Long id){
        categoryService.deleteById(id);
        return "删除成功";
    }
}
