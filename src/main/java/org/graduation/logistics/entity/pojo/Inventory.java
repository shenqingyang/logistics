package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Inventory {
    @TableId(type = IdType.AUTO)
    private Integer SKU;
    private Integer productId;
    private String description;
    private Integer amount;
    private Integer warehouseId;
}