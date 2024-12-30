package org.graduation.logistics.entity.bo;

import lombok.Data;

@Data
public class InventoryBo {
    private Integer inventoryId;
    private String SKU;
    private Integer productId;
    private String productName;
    private String description;
    private Integer amount;
    private Integer warehouseId;
    private String warehouseName;
}
