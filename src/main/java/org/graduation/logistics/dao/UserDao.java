package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.UserBo;
import org.graduation.logistics.entity.pojo.User;

public interface UserDao extends BaseMapper<User> {
    @Select("<script>" +
            "SELECT " +
            "u.user_id AS userId, " +
            "u.user_name AS userName, " +
            "u.password AS password, " +
            "u.profile AS profile, " +
            "u.role_id AS roleId, " +
            "r.name AS roleName, " +
            "u.phone AS phone, " +
            "u.login_account AS loginAccount, " +
            "u.warehouse_id AS warehouseId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN w.chinese_name ELSE w.english_name END, '') AS warehouseName, " +
            "u.store_id AS storeId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN s.chinese_name ELSE s.english_name END, '') AS storeName, " +
            "u.company_id AS companyId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN c.chinese_name ELSE c.english_name END, '') AS companyName, " +
            "u.department AS department, " +
            "u.post AS post " +
            "FROM user u " +
            "LEFT JOIN role r ON u.role_id = r.role_id " +
            "LEFT JOIN warehouse w ON u.warehouse_id = w.warehouse_id " +
            "LEFT JOIN store s ON u.store_id = s.store_id " +
            "LEFT JOIN company c ON u.company_id = c.company_id " +
            "WHERE u.user_id = #{userId} " +
            "</script>")
    UserBo selectUserBoByUserIdAndLanguage(@Param("userId") Integer userId, @Param("language") Integer language);
}