package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class Product {
    @TableId(type = IdType.AUTO)
    private Integer productId;
    private Integer companyId;
    private String chineseName;
    private String englishName;
    private Double price;
    @TableLogic //逻辑删除
    private Integer deleted;
}