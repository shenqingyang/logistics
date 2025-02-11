package org.graduation.logistics.entity.bo;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
@Data
public class MasterWaybillBo {
    private Integer masterWaybillId;
    private Timestamp createTime;
    private Integer storeId;
    private Integer companyId;
    List<WaybillBo> waybills;
}
