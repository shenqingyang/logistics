package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.WarehouseBo;
import org.graduation.logistics.entity.pojo.Warehouse;

import java.util.List;

public interface WarehouseDao extends BaseMapper<Warehouse> {
    @Select("<script>"
            + "SELECT "
            + "w.warehouse_id AS warehouseId, "
            + "CASE WHEN #{language} = 1 THEN w.chinese_name ELSE w.english_name END AS name, "
            + "w.zip_code AS zipCode, "
            + "w.location, "
            + "w.store_id AS storeId, "
            + "CASE WHEN #{language} = 1 THEN st.chinese_name ELSE st.english_name END AS storeName, "
            + "w.director_id AS directorId, "
            + "CASE WHEN #{language} = 1 THEN dr.chinese_name ELSE dr.english_name END AS directorName, "
            + "w.parent_warehouse_id AS parentWarehouseId, "
            + "CASE WHEN #{language} = 1 THEN pw.chinese_name ELSE pw.english_name END AS parentWarehouseName, "
            + "w.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN comp.chinese_name ELSE comp.english_name END AS companyName "
            + "FROM warehouse w "
            + "LEFT JOIN store st ON w.store_id = st.store_id "
            + "LEFT JOIN director dr ON w.director_id = dr.director_id "
            + "LEFT JOIN warehouse pw ON w.parent_warehouse_id = pw.warehouse_id "
            + "LEFT JOIN company comp ON w.company_id = comp.company_id "
            + "WHERE w.company_id = #{companyId} "
            + "</script>")
    List<WarehouseBo> selectWarehouseBosByCompanyId(@Param("companyId") Integer companyId, @Param("language") Integer language);
    @Select("<script>"
            + "SELECT "
            + "w.warehouse_id AS warehouseId, "
            + "CASE WHEN #{language} = 1 THEN w.chinese_name ELSE w.english_name END AS name, "
            + "w.zip_code AS zipCode, "
            + "w.location, "
            + "w.store_id AS storeId, "
            + "CASE WHEN #{language} = 1 THEN st.chinese_name ELSE st.english_name END AS storeName, "
            + "w.director_id AS directorId, "
            + "CASE WHEN #{language} = 1 THEN dr.chinese_name ELSE dr.english_name END AS directorName, "
            + "w.parent_warehouse_id AS parentWarehouseId, "
            + "CASE WHEN #{language} = 1 THEN pw.chinese_name ELSE pw.english_name END AS parentWarehouseName, "
            + "w.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN comp.chinese_name ELSE comp.english_name END AS companyName "
            + "FROM warehouse w "
            + "LEFT JOIN store st ON w.store_id = st.store_id "
            + "LEFT JOIN director dr ON w.director_id = dr.director_id "
            + "LEFT JOIN warehouse pw ON w.parent_warehouse_id = pw.warehouse_id "
            + "LEFT JOIN company comp ON w.company_id = comp.company_id "
            + "WHERE w.store_id = #{storeId} "
            + "</script>")
    List<WarehouseBo> selectWarehouseBosByStoreId(@Param("storeId") Integer storeId, @Param("language") Integer language);
    @Select("<script>"
            + "SELECT "
            + "w.warehouse_id AS warehouseId, "
            + "CASE WHEN #{language} = 1 THEN w.chinese_name ELSE w.english_name END AS name, "
            + "w.zip_code AS zipCode, "
            + "w.location, "
            + "w.store_id AS storeId, "
            + "CASE WHEN #{language} = 1 THEN st.chinese_name ELSE st.english_name END AS storeName, "
            + "w.director_id AS directorId, "
            + "CASE WHEN #{language} = 1 THEN dr.chinese_name ELSE dr.english_name END AS directorName, "
            + "w.parent_warehouse_id AS parentWarehouseId, "
            + "CASE WHEN #{language} = 1 THEN pw.chinese_name ELSE pw.english_name END AS parentWarehouseName, "
            + "w.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN comp.chinese_name ELSE comp.english_name END AS companyName "
            + "FROM warehouse w "
            + "LEFT JOIN store st ON w.store_id = st.store_id "
            + "LEFT JOIN director dr ON w.director_id = dr.director_id "
            + "LEFT JOIN warehouse pw ON w.parent_warehouse_id = pw.warehouse_id "
            + "LEFT JOIN company comp ON w.company_id = comp.company_id "
            + "WHERE w.parent_warehouse_id = #{parentWarehouseId} "
            + "</script>")
    List<WarehouseBo> selectWarehouseBosByParentWarehouseId(@Param("parentWarehouseId") Integer parentWarehouseId, @Param("language") Integer language);
    @Select("<script>"
            + "SELECT "
            + "w.warehouse_id AS warehouseId, "
            + "CASE WHEN #{language} = 1 THEN w.chinese_name ELSE w.english_name END AS name, "
            + "w.zip_code AS zipCode, "
            + "w.location, "
            + "w.store_id AS storeId, "
            + "CASE WHEN #{language} = 1 THEN st.chinese_name ELSE st.english_name END AS storeName, "
            + "w.director_id AS directorId, "
            + "CASE WHEN #{language} = 1 THEN dr.chinese_name ELSE dr.english_name END AS directorName, "
            + "w.parent_warehouse_id AS parentWarehouseId, "
            + "CASE WHEN #{language} = 1 THEN pw.chinese_name ELSE pw.english_name END AS parentWarehouseName, "
            + "w.company_id AS companyId, "
            + "CASE WHEN #{language} = 1 THEN comp.chinese_name ELSE comp.english_name END AS companyName "
            + "FROM warehouse w "
            + "LEFT JOIN store st ON w.store_id = st.store_id "
            + "LEFT JOIN director dr ON w.director_id = dr.director_id "
            + "LEFT JOIN warehouse pw ON w.parent_warehouse_id = pw.warehouse_id "
            + "LEFT JOIN company comp ON w.company_id = comp.company_id "
            + "WHERE w.warehouse_id = #{warehouseId} "
            + "</script>")
    WarehouseBo selectWarehouseBoByWarehouseId(@Param("warehouseId") Integer warehouseId, @Param("language") Integer language);
}