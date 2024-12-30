package org.graduation.logistics.entity.bo;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class MaterialApproverBo {
    private Integer materialId;
    private Integer approverId;
    private String approverName;
    private Timestamp completeTime;
    private Integer order;
    private Byte status;
}
