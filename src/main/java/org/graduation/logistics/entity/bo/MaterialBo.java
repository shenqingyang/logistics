package org.graduation.logistics.entity.bo;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
@Data
public class MaterialBo {
    private Integer materialId;
    private String model;
    private String specifications;
    private Integer amount;
    private Double price;
    private Integer warehouseId;
    private String warehouseName;
    private Integer storeId;
    private String storeName;
    private Integer companyId;
    private String companyName;
    private Byte status;
    private Integer applicantId;
    private String applicantName;
    private Integer completePeopleId;
    private String completePeopleName;
    List<MaterialApproverBo> approvers;
    private Timestamp createTime;
}
