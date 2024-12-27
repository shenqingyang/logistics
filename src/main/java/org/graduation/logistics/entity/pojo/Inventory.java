package org.graduation.logistics.entity.pojo;

import lombok.Data;

@Data
public class Inventory {
    private Integer SKU;
    private Integer productId;
    private String description;
    private Integer amount;
}