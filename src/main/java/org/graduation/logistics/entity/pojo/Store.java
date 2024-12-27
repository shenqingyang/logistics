package org.graduation.logistics.entity.pojo;

import lombok.Data;

@Data
public class Store {
    private Integer storeId;
    private String chineseName;
    private String englishName;
    private Integer cityId;
    private Integer superintendentId;
    private Integer companyId;
}