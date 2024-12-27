package org.graduation.logistics.entity.pojo;

import lombok.Data;

@Data
public class Company {
    private Integer companyId;
    private String chineseName;
    private String englishName;
    private Integer parentCompanyId;
    private Integer countryId;
    private Integer provinceId;
}