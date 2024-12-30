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
    private Byte operationType;//1为登录，2：记录客户userId 3：记录waybillId 4.记录masterWaybillId 5.记录newsId 6.记录channelId
    private Integer changeId;
    private Integer companyId;
    private Integer storeId;
    private Integer warehouseId;
}