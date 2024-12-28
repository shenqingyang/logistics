package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.sql.Timestamp;

public class Material {
    @TableId(type = IdType.AUTO)
    private Integer materialId;
    private String model;
    private String specifications;
    private Integer amount;
    private Double price;
    private Integer warehouseId;
    private Integer storeId;
    private Integer companyId;
    private Byte status;
    private Timestamp createTime;
}
