package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class Address {
    @TableId(type = IdType.AUTO)
    private Integer addressId;
    private String name;
    private Integer countryId;
    private String countryName;
    private Integer provinceId;
    private Integer cityId;
    private Integer districtId;
    private String location;
    private String zipCode;
    private Byte type;
    private Integer userId;
    private String phone;
    @TableLogic //逻辑删除
    private Integer deleted;
}
