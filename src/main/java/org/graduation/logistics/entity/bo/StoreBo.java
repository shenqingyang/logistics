package org.graduation.logistics.entity.bo;

import lombok.Data;

@Data
public class StoreBo {
    private Integer storeId;
    private String name;
    private Integer cityId;
    private String cityName;
    private Integer directorId;
    private String directorName;
    private Integer companyId;
    private String companyName;
}
