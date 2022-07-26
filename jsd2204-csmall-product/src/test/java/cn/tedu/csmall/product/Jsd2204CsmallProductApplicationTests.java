package cn.tedu.csmall.product;

import cn.tedu.csmall.product.pojo.entity.Album;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class Jsd2204CsmallProductApplicationTests {

    @Test
    void contextLoads() {

        }

    @Autowired
    DataSource dataSource;

    @Test
    void testConnection() throws Exception {
        dataSource.getConnection();
    }
}
