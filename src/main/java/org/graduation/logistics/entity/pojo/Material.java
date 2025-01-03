package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.sql.Timestamp;
@Data
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
    private Integer applicantId;
    private Integer completePeopleId;
    @TableLogic //逻辑删除
    private Integer deleted;
}
