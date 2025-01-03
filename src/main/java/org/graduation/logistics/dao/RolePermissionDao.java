package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.pojo.RolePermission;

public interface RolePermissionDao extends BaseMapper<RolePermission> {
    @Select("SELECT COUNT(*) FROM role_permission WHERE role_id IN " +
            "(SELECT role_id FROM user_role WHERE user_id = #{userId}) " +
            "AND permission_code = #{permissionCode}")
    int checkPermissionByUserId(@Param("userId") int userId,
                                       @Param("permissionCode") int permissionCode);
}