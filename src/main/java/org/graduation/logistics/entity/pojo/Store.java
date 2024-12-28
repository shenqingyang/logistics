package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Store {
    @TableId(type = IdType.AUTO)
    private Integer storeId;
    private String chineseName;
    private String englishName;
    private Integer cityId;
    private Integer directorId;
    private Integer companyId;
}