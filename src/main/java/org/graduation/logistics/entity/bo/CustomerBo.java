package org.graduation.logistics.entity.bo;

import lombok.Data;

@Data
public class CustomerBo {
    private Integer userId;
    private Integer storeId;
    private String storeName;
    private Double surplus;
    private Integer level;
    private Boolean enabled;
    private String userName;
    private String phone;
    private String profile;
    private Integer companyId;
    private String companyName;
}
