package cn.tedu.csmall.passport.config;

import cn.tedu.csmall.passport.filter.JwtAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    @Autowired
    JwtAuthenticationFilter jwtAuthenticationFilter;

    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        String[] urls = {
          "/doc.html","/**/*.js","/**/*.css","/swagger-resources/**","/v2/api-docs/**",
                "/admins/login"
        };
        http.csrf().disable();//禁用防止伪造跨域攻击
        //http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);//不通过session获取securityContext
        http.authorizeRequests()//要求请求实现必须被授权
                .antMatchers(urls)//匹配一些路径
                .permitAll()//允许访问
                .anyRequest()//除以上配置以外的请求都需要认证
                .authenticated();//经过认证的
        http.formLogin();//启用登录表单，未授权的请求都重定向到此页面

        http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
    }

}
