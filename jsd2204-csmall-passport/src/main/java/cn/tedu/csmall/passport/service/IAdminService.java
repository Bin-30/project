package cn.tedu.csmall.passport.service;

import cn.tedu.csmall.passport.pojo.dto.AdminAddNewDTO;
import cn.tedu.csmall.passport.pojo.dto.AdminLoginDto;

public interface IAdminService {
    String login(AdminLoginDto adminLoginDto);

    void addNew(AdminAddNewDTO adminAddNewDTO);
}
