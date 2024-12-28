package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Warehouse {
    @TableId(type = IdType.AUTO)
    private Integer warehouseId;
    private String chineseName;
    private String englishName;
    private String zipCode;
    private String location;
    private Integer storeId;
    private Integer directorId;
    private Integer parentWarehouseId;
    private Integer companyId;
}