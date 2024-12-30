package org.graduation.logistics.entity.bo;

import lombok.Data;

@Data
public class ProductBo {
    private Integer productId;
    private Integer companyId;
    private String companyName;
    private String name;
    private Double price;
    private String profile;
}
