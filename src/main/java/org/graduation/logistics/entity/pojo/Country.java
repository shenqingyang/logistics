package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Country {
    @TableId(type = IdType.AUTO)
    private Integer countryId;
    private String countryCode;
    private String chineseName;
    private String englishName;
}
