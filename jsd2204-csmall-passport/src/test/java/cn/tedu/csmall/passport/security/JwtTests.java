package cn.tedu.csmall.passport.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@Slf4j
@SpringBootTest
public class JwtTests {
    String secretKey = "asdas";
    @Test
    public void testJwt() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", 30);
        claims.put("name", "curry");

        String jwt = Jwts.builder()
                .setHeaderParam("alg", "HS256")
                .setHeaderParam("typ", "jwt")
                .setClaims(claims)
                //.setExpiration(new Date(System.currentTimeMillis() + 3 * 60 * 1000))
                .signWith(SignatureAlgorithm.HS256, secretKey)
                .compact();
        log.debug("{}", jwt);
        //eyJhbGciOiJIUzI1NiIsInR5cCI6Imp3dCJ9.eyJuYW1lIjoiY3VycnkiLCJpZCI6MzB9.FYxrIFlsVLw92wDepWPoVVTtVbyQxyNYbmwqiJgjWnM
    }

    @Test
    void testParse(){
        String jwt="eyJhbGciOiJIUzI1NiIsInR5cCI6Imp3dCJ9.eyJuYW1lIjoiY3VycnkiLCJpZCI6MzB9.FYxrIFlsVLw92wDepWPoVVTtVbyQxyNYbmwqiJgjWnM";
        Claims claims = (Claims) Jwts.parser().setSigningKey(secretKey).parse(jwt).getBody();
        Object id = claims.get("id");
        Object name = claims.get("name");
        log.debug("{}",id);
        log.debug("{}",name);
    }
}
