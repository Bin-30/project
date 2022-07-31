package cn.tedu.csmall.product.controller;

import cn.tedu.csmall.product.ex.ServiceException;
import cn.tedu.csmall.product.pojo.dto.AlbumAddNewDTO;
import cn.tedu.csmall.product.service.IAlbumService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/albums")
public class AlbumController {
    @Autowired
    IAlbumService iAlbumService;

    public AlbumController() {
        log.info("控制类");
    }


    @RequestMapping(value = {"/add-new"})
    public String Add(@Validated AlbumAddNewDTO albumAddNewDTO) {
        iAlbumService.addNew(albumAddNewDTO);
        return "添加成功";

    }

    @RequestMapping("/{id:[0-9]+}/delete")
    public String delete(@PathVariable("id") Long id) {
        iAlbumService.deleteByID(id);
        return "处理了delete";
    }
}
