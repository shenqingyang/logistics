package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class Country {
    @TableId(type = IdType.AUTO)
    private Integer countryId;
    private String countryCode;
    private String chineseName;
    private String englishName;
    @TableLogic //逻辑删除
    private Integer deleted;
}
