package org.graduation.logistics.entity.bo;

import lombok.Data;

import java.util.List;

@Data
public class WarehouseBo {
    private Integer warehouseId;
    private String name;
    private String zipCode;
    private String location;
    private Integer storeId;
    private String storeName;
    private Integer directorId;
    private String directorName;
    private Integer parentWarehouseId;
    private String parentWarehouseName;
    private List<WarehouseBo> children;
    private Integer companyId;
    private String companyName;
}
