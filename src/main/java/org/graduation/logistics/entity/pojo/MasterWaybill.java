package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class MasterWaybill {
    @TableId(type = IdType.AUTO)
    private Integer masterWaybillId;
    private Timestamp createTime;
    private Integer storeId;
    private Integer companyId;
}