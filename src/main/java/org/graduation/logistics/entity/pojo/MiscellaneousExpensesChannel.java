package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class MiscellaneousExpensesChannel {
    @TableId(type = IdType.AUTO)
    private Integer channelId;
    private Integer miscellaneousExpensesId;
    private Double defaultPrice;
    private Double discount;
    private Timestamp expirationDate;
}