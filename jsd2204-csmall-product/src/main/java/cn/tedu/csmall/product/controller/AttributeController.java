package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.pojo.dto.AttributeAddNewDTO;
import cn.tedu.csmall.product.service.AttributeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/attributes")
public class AttributeController {
    @Autowired
    AttributeService attributeService;

    public AttributeController() {
        log.debug("AttributeController");
    }
    @RequestMapping("/add-new")
    public String insert(AttributeAddNewDTO attributeAddNewDTO){
        attributeService.addNew(attributeAddNewDTO);
        return "添加成功";
    }

    @RequestMapping("/{id}/delete")
    public String deleteById(@PathVariable Long id){
        attributeService.deleteById(id);
        return "删除成功";
    }
}
