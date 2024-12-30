package org.graduation.logistics.entity.bo;

import lombok.Data;
import org.graduation.logistics.entity.pojo.Company;

import java.util.List;
@Data
public class CompanyBo {
    private Integer companyId;
    private String name;
    private Integer parentCompanyId;
    private String parentCompanyName;
    List<CompanyBo> children;
    private Integer provinceId;
    private String provinceName;
    private String location;
}
