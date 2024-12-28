package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Company {
    @TableId(type = IdType.AUTO)
    private Integer companyId;
    private String chineseName;
    private String englishName;
    private Integer parentCompanyId;
    private Integer provinceId;
    private String location;
}