package cn.tedu.csmall.passport.security;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class BCryptTests {
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    @Test
    void test(){
        String pwd = "123";
        String encode = passwordEncoder.encode(pwd);
        System.out.println(encode);
    }

    @Test
    void testMatches(){
        String pwd = "123";
        String encode ="$2a$10$e99rQT40ybDr12W0uHU3Oe6rGTzjR3XboS9Xe2/S/e5z.Q3PLUBi2";
        boolean matches = passwordEncoder.matches(pwd, encode);
        System.out.println(matches);
    }
}
