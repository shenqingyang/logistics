package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class Inventory {
    @TableId(type = IdType.AUTO)
    private Integer inventoryId;
    private String SKU;
    private Integer productId;
    private String description;
    private Integer amount;
    private Integer warehouseId;
    @TableLogic //逻辑删除
    private Integer deleted;
}