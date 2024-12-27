package org.graduation.logistics.entity.pojo;

import lombok.Data;

@Data
public class Address {
    private Integer addressId;
    private String name;
    private Integer countryId;
    private Integer provinceId;
    private Integer cityId;
    private String location;
    private String zipCode;
    private Byte type;
    private Integer userId;
}
