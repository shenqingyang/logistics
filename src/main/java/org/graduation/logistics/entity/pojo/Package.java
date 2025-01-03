package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class Package {
    @TableId(type = IdType.AUTO)
    private Integer packageId;
    private Integer SKU;
    private Integer amount;
    private Double weight;
    private Double height;
    private Double length;
    private Double insured;
    private Double totalPrice;
    private Integer storeId;
    @TableLogic //逻辑删除
    private Integer deleted;
}