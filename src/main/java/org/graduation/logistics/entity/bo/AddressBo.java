package org.graduation.logistics.entity.bo;

import lombok.Data;

@Data
public class AddressBo {
    private Integer addressId;
    private String name;
    private Integer countryId;
    private String countryName;
    private Integer cityId;
    private String cityName;
    private Integer provinceId;
    private String provinceName;
    private String location;
    private Byte type;
    private Integer userId;
}
