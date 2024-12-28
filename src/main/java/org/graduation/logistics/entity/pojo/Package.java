package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Package {
    @TableId(type = IdType.AUTO)
    private Integer packageId;
    private Integer SKU;
    private Integer amount;
    private Double weight;
    private Double height;
    private Double long_;
    private Double insured;
    private Double totalPrice;
    private Integer storeId;
}