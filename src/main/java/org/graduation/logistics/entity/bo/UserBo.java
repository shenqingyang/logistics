package org.graduation.logistics.entity.bo;

import lombok.Data;

import java.util.List;


@Data
public class UserBo {
    private Integer userId;
    private String userName;
    private String profile;
    private List<RoleBo> roles;
    private String phone;
    private Integer warehouseId;
    private String warehouseName;
    private Integer storeId;
    private String storeName;
    private Integer companyId;
    private String companyName;
    private String department;
    private String post;
    @Override
    public String toString() {
        return "UserBo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", profile='" + profile + '\'' +
                ", phone='" + phone + '\'' +
                ", warehouseId=" + warehouseId +
                ", warehouseName='" + warehouseName + '\'' +
                ", storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", department='" + department + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
