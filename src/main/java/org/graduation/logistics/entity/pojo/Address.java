package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Address {
    @TableId(type = IdType.AUTO)
    private Integer addressId;
    private String name;
    private Integer countryId;
    private Integer provinceId;
    private Integer cityId;
    private Integer districtId;
    private String location;
    private String zipCode;
    private Byte type;
    private Integer userId;
}
