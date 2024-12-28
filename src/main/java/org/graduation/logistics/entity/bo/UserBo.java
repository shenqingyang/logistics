package org.graduation.logistics.entity.bo;

import lombok.Data;

@Data
public class UserBo {
    private Integer userId;
    private String userName;
    private String password;
    private String profile;
    private Integer roleId;
    private String roleName;
    private String phone;
    private String loginAccount;
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
                ", password='" + password + '\'' +
                ", profile='" + profile + '\'' +
                ", roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", phone='" + phone + '\'' +
                ", loginAccount='" + loginAccount + '\'' +
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
