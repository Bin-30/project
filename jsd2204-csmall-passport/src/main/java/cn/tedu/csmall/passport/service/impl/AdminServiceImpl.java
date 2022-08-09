package cn.tedu.csmall.passport.service.impl;

import cn.tedu.csmall.passport.ex.ServiceException;
import cn.tedu.csmall.passport.mapper.AdminMapper;
import cn.tedu.csmall.passport.pojo.dto.AdminAddNewDTO;
import cn.tedu.csmall.passport.pojo.dto.AdminLoginDto;
import cn.tedu.csmall.passport.pojo.entity.Admin;
import cn.tedu.csmall.passport.service.IAdminService;
import cn.tedu.csmall.passport.web.ServiceCode;
import com.alibaba.fastjson.JSON;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.currentTimeMillis;

@Slf4j
@Service
public class AdminServiceImpl implements IAdminService {
    @Autowired
    AdminMapper adminMapper;

    @Autowired
    AuthenticationManager authenticationmanager;

    @Override
    public String login(AdminLoginDto adminLoginDto){
        Authentication authentication = new UsernamePasswordAuthenticationToken(adminLoginDto.getUsername(),adminLoginDto.getPassword());
        Authentication authenticate = authenticationmanager.authenticate(authentication);
        User loginUser = (User)authenticate.getPrincipal();
        String secretKey = "asdas";
        String username = loginUser.getUsername();
        Collection<GrantedAuthority> authorities = loginUser.getAuthorities();
        Map<String, Object> claims = new HashMap<>();
        claims.put("username",username);
        String jsonString = JSON.toJSONString(authorities);
        claims.put("authorities",jsonString);
        String jwt = Jwts.builder()
                .setHeaderParam("alg", "HS256")
                .setHeaderParam("typ", "jwt")
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS256,secretKey)
                .setExpiration(new Date(currentTimeMillis()+24*60*60*1000))
                .compact();
        log.debug("{}",authenticate.getPrincipal().getClass().getName());
        log.debug("验证成功");
        log.debug("{}",jwt);
        return jwt;
    }
    @Override
    public void addNew(AdminAddNewDTO adminAddNewDTO) {
        int countByName = adminMapper.countByName(adminAddNewDTO.getUsername());
        if (countByName>0){
            log.warn("用户名已存在");
            throw new ServiceException(ServiceCode.ERR_CONFLICT,"用户名已存在");
        }
        Admin admin = new Admin();
        BeanUtils.copyProperties(adminAddNewDTO,admin);
        admin.setGmtCreate(LocalDateTime.now());
        admin.setGmtModified(LocalDateTime.now());
        admin.setLoginCount(0);
        admin.setGmtLastLogin(null);
        log.debug("adminAddNewDTO:{}",adminAddNewDTO);
        String rawPassword = admin.getPassword();
        String encode = new BCryptPasswordEncoder().encode(rawPassword);
        admin.setPassword(encode);
        int i = adminMapper.insert(admin);
        if (i != 1) {
            log.warn("服务器繁忙");
            throw new ServiceException(ServiceCode.ERR_INSERT,"服务器繁忙");
        }
        log.debug("添加成功");
    }
}
