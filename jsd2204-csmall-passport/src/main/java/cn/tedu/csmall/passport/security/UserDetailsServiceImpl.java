package cn.tedu.csmall.passport.security;

import cn.tedu.csmall.passport.mapper.AdminMapper;
import cn.tedu.csmall.passport.pojo.vo.AdminLoginInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        AdminLoginInfoVo LoginInfoVo = adminMapper.selectByName(s);
        boolean enable = LoginInfoVo.getEnable()==0? true :false;
        List<String> permissions = LoginInfoVo.getPermissions();
        if (LoginInfoVo !=null){
            UserDetails userDetails = User.builder()
                    .username(LoginInfoVo.getUsername())
                    .password(LoginInfoVo.getPassword())
                    .accountExpired(false)
                    .accountLocked(false)
                    .credentialsExpired(false)
                    .disabled(enable)
                    .authorities(permissions.toArray(new String[]{}))
                    .build();
            return userDetails;
        }
        throw new UsernameNotFoundException("0000");

    }
}
