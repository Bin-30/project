package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.pojo.dto.BrandAddNewDTO;
import cn.tedu.csmall.product.service.IBrandService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    IBrandService iBrandService;

    public BrandController() {
        log.debug("BrandController");
    }

    @RequestMapping("/add-new")
    public String insert(BrandAddNewDTO brandAddNewDTO) {
        iBrandService.addNew(brandAddNewDTO);
        return "添加成功";
    }

    @RequestMapping("/{id:[0-9]+}/delete")
    public String deleteById(@PathVariable Long id){
        iBrandService.deleteById(id);
        return "删除成功";
    }
}
