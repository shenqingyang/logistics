package org.graduation.logistics.entity.pojo;

import lombok.Data;

@Data
public class Warehouse {
    private Integer warehouseId;
    private String chineseName;
    private String englishName;
    private String zipCode;
    private String location;
    private Integer storeId;
}