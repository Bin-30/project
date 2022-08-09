package cn.tedu.csmall.passport.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class AdminAddNewDTO implements Serializable {
    private Long id;
    @NotNull(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名")
    private String username;
    @NotNull(message = "密码不能为空")
    @ApiModelProperty(value = "密码")
    private String password;
    private String nickname;
    private String avatar;
    private String phone;
    private String email;
    private String description;
    private Integer enable;
}
