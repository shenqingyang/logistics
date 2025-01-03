package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class Province {
    @TableId(type = IdType.AUTO)
    private Integer provinceId;
    private String chineseName;
    private String englishName;
    private Integer countryId;
    @TableLogic //逻辑删除
    private Integer deleted;
}
