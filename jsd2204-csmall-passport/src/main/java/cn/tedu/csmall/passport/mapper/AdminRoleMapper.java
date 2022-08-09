package cn.tedu.csmall.passport.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRoleMapper {
    void insert(@Param("adminId") Integer aId, @Param("roleId") Integer rId);
}
