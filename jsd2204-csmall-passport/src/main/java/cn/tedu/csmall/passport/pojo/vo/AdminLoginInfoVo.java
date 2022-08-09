package cn.tedu.csmall.passport.pojo.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AdminLoginInfoVo implements Serializable {
    private String username;
    private String password;
    private Integer enable;
    private Integer id;
    private List<String> permissions;
}
