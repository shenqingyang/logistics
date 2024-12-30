package org.graduation.logistics.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.graduation.logistics.entity.bo.InventoryBo;
import org.graduation.logistics.entity.pojo.Inventory;

import java.util.List;

public interface InventoryDao extends BaseMapper<Inventory> {
    @Select("<script>"
            + "SELECT "
            + "i.inventory_id AS inventoryId, "
            + "i.SKU, "
            + "i.product_id AS productId, "
            + "CASE WHEN #{language} = 1 THEN p.chinese_name ELSE p.english_name END AS productName, "
            + "i.description, "
            + "i.amount, "
            + "i.warehouse_id AS warehouseId, "
            + "CASE WHEN #{language} = 1 THEN w.chinese_name ELSE w.english_name END AS warehouseName "
            + "FROM inventory i "
            + "LEFT JOIN product p ON i.product_id = p.product_id "
            + "LEFT JOIN warehouse w ON i.warehouse_id = w.warehouse_id "
            + "WHERE i.warehouse_id = #{warehouseId} "
            + "</script>")
    List<InventoryBo> selectInventoryBosByWarehouseId(@Param("warehouseId") Integer warehouseId, @Param("language") Integer language);
    @Select("<script>"
            + "SELECT "
            + "i.inventory_id AS inventoryId, "
            + "i.SKU, "
            + "i.product_id AS productId, "
            + "CASE WHEN #{language} = 1 THEN p.chinese_name ELSE p.english_name END AS productName, "
            + "i.description, "
            + "i.amount, "
            + "i.warehouse_id AS warehouseId, "
            + "CASE WHEN #{language} = 1 THEN w.chinese_name ELSE w.english_name END AS warehouseName "
            + "FROM inventory i "
            + "LEFT JOIN product p ON i.product_id = p.product_id "
            + "LEFT JOIN warehouse w ON i.warehouse_id = w.warehouse_id "
            + "WHERE i.inventory_id = #{inventoryId} "
            + "</script>")
    InventoryBo selectInventoryBoByInventoryId(@Param("inventoryId") Integer inventoryId, @Param("language") Integer language);
}