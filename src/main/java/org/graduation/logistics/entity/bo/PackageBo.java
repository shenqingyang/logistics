package org.graduation.logistics.entity.bo;

import lombok.Data;

@Data
public class PackageBo {
    private Integer packageId;
    private Integer SKU;
    private Integer productId;
    private String productName;
    private String productProfile;
    private Integer amount;
    private Double weight;
    private Double height;
    private Double length;
    private Double insured;
    private Double totalPrice;
    private Integer storeId;
    private String storeName;
}
