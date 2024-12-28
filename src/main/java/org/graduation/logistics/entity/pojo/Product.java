package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Product {
    @TableId(type = IdType.AUTO)
    private Integer productId;
    private Integer companyId;
    private String chineseName;
    private String englishName;
    private Double price;
    private String profile;
}