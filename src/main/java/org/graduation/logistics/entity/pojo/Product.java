package org.graduation.logistics.entity.pojo;

import lombok.Data;

@Data
public class Product {
    private Integer productId;
    private String brand;
    private String chineseName;
    private String englishName;
    private Double price;
    private String profile;
}