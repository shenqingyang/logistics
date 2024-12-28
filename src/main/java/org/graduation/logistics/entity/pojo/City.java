package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class City {
    @TableId(type = IdType.AUTO)
    private Integer cityId;
    private String chineseName;
    private String englishName;
    private Integer provinceId;
}
