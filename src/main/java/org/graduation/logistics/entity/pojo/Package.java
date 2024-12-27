package org.graduation.logistics.entity.pojo;

import lombok.Data;

@Data
public class Package {
    private Integer packageId;
    private Integer SKU;
    private Integer amount;
    private Double weight;
    private Double height;
    private Double long_;
    private Double insured;
    private Double totalPrice;
}