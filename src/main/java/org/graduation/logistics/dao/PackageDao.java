package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.PackageBo;
import org.graduation.logistics.entity.pojo.Package;

import java.util.List;

public interface PackageDao extends BaseMapper<Package> {
    @Select("<script>"
            + "SELECT "
            + "p.package_id AS packageId, "
            + "p.SKU, "
            + "p.product_id AS productId, "
            + "CASE WHEN #{language} = 1 THEN pr.chinese_name ELSE pr.english_name END AS productName, "
            + "pr.profile AS productProfile, "
            + "p.amount, "
            + "p.weight, "
            + "p.height, "
            + "p.length, "
            + "p.insured, "
            + "p.total_price AS totalPrice, "
            + "p.store_id AS storeId, "
            + "CASE WHEN #{language} = 1 THEN s.chinese_name ELSE s.english_name END AS storeName "
            + "FROM package p "
            + "LEFT JOIN product pr ON p.product_id = pr.product_id "
            + "LEFT JOIN store s ON p.store_id = s.store_id "
            + "WHERE p.store_id = #{storeId} "
            + "</script>")
    List<PackageBo> selectPackageBosByStoreId(@Param("storeId") Integer storeId, @Param("language") Integer language);
    @Select("<script>"
            + "SELECT "
            + "p.package_id AS packageId, "
            + "p.SKU, "
            + "p.product_id AS productId, "
            + "CASE WHEN #{language} = 1 THEN pr.chinese_name ELSE pr.english_name END AS productName, "
            + "pr.profile AS productProfile, "
            + "p.amount, "
            + "p.weight, "
            + "p.height, "
            + "p.length, "
            + "p.insured, "
            + "p.total_price AS totalPrice, "
            + "p.store_id AS storeId, "
            + "CASE WHEN #{language} = 1 THEN s.chinese_name ELSE s.english_name END AS storeName "
            + "FROM package p "
            + "LEFT JOIN product pr ON p.product_id = pr.product_id "
            + "LEFT JOIN store s ON p.store_id = s.store_id "
            + "WHERE p.package_id = #{packageId} "
            + "</script>")
    PackageBo selectPackageBoByPackageId(@Param("packageId") Integer packageId, @Param("language") Integer language);
}