package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.pojo.dto.PictureAddNewDTO;
import cn.tedu.csmall.product.service.PictureService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/pictures")
public class PictureController {
    @Autowired
    PictureService pictureService;
    public PictureController() {
        log.debug("PictureController");
    }

    @RequestMapping("/add-new")
    public String AddNew(PictureAddNewDTO pictureAddNewDTO){
        pictureService.addNew(pictureAddNewDTO);
        return "添加成功";
    }

    @RequestMapping("/{id:[0-9]+}/delete")
    public String deleteById(@PathVariable Long id){
        pictureService.deleteById(id);
        return "删除成功";
    }
}
