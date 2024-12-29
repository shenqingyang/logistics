package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.CustomerBo;
import org.graduation.logistics.entity.bo.UserBo;
import org.graduation.logistics.entity.pojo.User;

import java.util.List;

public interface UserDao extends BaseMapper<User> {
    @Select("<script>" +
            "SELECT " +
            "u.user_id AS userId, " +
            "u.user_name AS userName, " +
            "u.profile AS profile, " +
            "u.role_id AS roleId, " +
            "r.name AS roleName, " +
            "u.phone AS phone, " +
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
    UserBo selectUserBoByUserId(@Param("userId") Integer userId, @Param("language") Byte language);
    @Select("<script>" +
            "SELECT " +
            "u.user_id AS userId, " +
            "u.user_name AS userName, " +
            "u.profile AS profile, " +
            "u.role_id AS roleId, " +
            "r.name AS roleName, " +
            "u.phone AS phone, " +
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
            "WHERE u.company_id = #{companyId} " +
            "</script>")
    List<UserBo> selectUserBosByCompanyId(@Param("companyId") Integer companyId, @Param("language") Byte language);
    @Select("<script>" +
            "SELECT " +
            "c.user_id as userId, " +
            "c.store_id as storeId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN s.chinese_name ELSE s.english_name END, '') as storeName, " +
            "c.surplus as surplus, " +
            "c.level as level, " +
            "c.enabled as enabled, " +
            "u.user_name as userName, " +
            "u.phone as phone, " +
            "u.profile as profile, " +
            "c.company_id as companyId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN co.chinese_name ELSE co.english_name END, '') as companyName " +
            "FROM customer_store c " +
            "LEFT JOIN user u ON c.user_id = u.user_id " +
            "LEFT JOIN store s ON c.store_id = s.store_id " +
            "LEFT JOIN company co ON c.company_id = co.company_id " +
            "WHERE c.store_id = #{storeId}</script>")
    List<CustomerBo> selectCustomerBosByStoreId(@Param("storeId") Integer storeId, @Param("language") Integer language);
    @Select("<script>" +
            "SELECT " +
            "c.user_id as userId, " +
            "c.store_id as storeId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN s.chinese_name ELSE s.english_name END, '') as storeName, " +
            "c.surplus as surplus, " +
            "c.level as level, " +
            "c.enabled as enabled, " +
            "u.user_name as userName, " +
            "u.phone as phone, " +
            "u.profile as profile, " +
            "c.company_id as companyId, " +
            "COALESCE(CASE WHEN #{language} = 1 THEN co.chinese_name ELSE co.english_name END, '') as companyName " +
            "FROM customer_store c " +
            "LEFT JOIN user u ON c.user_id = u.user_id " +
            "LEFT JOIN store s ON c.store_id = s.store_id " +
            "LEFT JOIN company co ON c.company_id = co.company_id " +
            "WHERE c.store_id = #{storeId} AND c.user_id = #{userId}</script>")
    CustomerBo selectCustomerBoByStoreIdAndUserId(@Param("storeId") Integer storeId,@Param("userId")Integer userId,@Param("language") Integer language);
}