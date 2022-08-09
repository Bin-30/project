package cn.tedu.csmall.passport.pojo.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class AdminRoleDto implements Serializable {
    private Integer adminId;
    private Integer roleId;
}
