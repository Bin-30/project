package cn.tedu.csmall.product.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/spuDetail")
public class SpuDetailController {
    public SpuDetailController() {
        log.debug("SpuDetailController");
    }

    @RequestMapping("/add-new")
    public void insert(){

    }
}
