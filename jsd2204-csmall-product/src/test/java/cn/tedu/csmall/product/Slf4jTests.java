package cn.tedu.csmall.product;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class Slf4jTests {
    @Test
    void testSlf4j(){
        log.trace("11111");
        log.debug("22222");
        log.info("33333");
        log.warn("44444");
        log.error("55555");

        int a = 1;
        int b = 2;
        log.debug("a={},b={},a+b={}",a,b,a+b);
        log.debug("a="+a+",b="+b+",a+b="+(a+b));
    }
}
