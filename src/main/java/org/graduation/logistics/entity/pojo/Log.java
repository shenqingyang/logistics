package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Log {
    @TableId(type = IdType.AUTO)
    private Integer logId;
    private Timestamp time;
    private Integer userId;
    private Byte operationType;//1为登录，2为修改
    private Integer changeId;//1：记录客户userId 2：记录waybillId 3.记录masterWaybillId 4.记录newsId 5.记录channelId
    private Integer companyId;
    private Integer storeId;
    private Integer warehouseId;
}