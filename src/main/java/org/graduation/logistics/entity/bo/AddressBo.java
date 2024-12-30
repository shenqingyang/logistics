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
    private Integer districtId;
    private String districtName;
    private String location;
    private String zipCode;
    private Byte type;
    private Integer userId;
    private String phone;
    @Override
    public String toString() {
        return "AddressBo{" +
                "addressId=" + addressId +
                ", name='" + name + '\'' +
                ", countryId=" + countryId +
                ", countryName='" + countryName + '\'' +
                ", cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", provinceId=" + provinceId +
                ", provinceName='" + provinceName + '\'' +
                ", districtId=" + districtId +
                ", districtName='" + districtName + '\'' +
                ", location='" + location + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", type=" + type +
                ", userId=" + userId +
                '}';
    }
}
