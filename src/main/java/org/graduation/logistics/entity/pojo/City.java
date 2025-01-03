package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class City {
    @TableId(type = IdType.AUTO)
    private Integer cityId;
    private String chineseName;
    private String englishName;
    private Integer provinceId;
    private String zipCode;
    @TableLogic //逻辑删除
    private Integer deleted;
}
