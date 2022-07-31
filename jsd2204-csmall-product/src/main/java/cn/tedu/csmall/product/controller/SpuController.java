package cn.tedu.csmall.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/spu")
public class SpuController {
    public SpuController() {
        log.debug("SpuController");
    }

    @RequestMapping("/add-new")
    public void insert(){

    }
}
