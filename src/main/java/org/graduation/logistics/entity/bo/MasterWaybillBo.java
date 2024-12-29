package org.graduation.logistics.entity.bo;

import java.sql.Timestamp;
import java.util.List;

public class MasterWaybillBo {
    private Integer masterWaybillId;
    private Timestamp createTime;
    private Integer storeId;
    private Integer companyId;
    List<WaybillBo> waybills;
}
