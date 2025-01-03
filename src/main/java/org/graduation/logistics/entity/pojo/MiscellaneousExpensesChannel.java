package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class MiscellaneousExpensesChannel {
    private Integer channelId;
    private Integer miscellaneousExpensesId;
    private Double defaultPrice;
    private Double discount;
    private Timestamp expirationDate;
    @TableLogic //逻辑删除
    private Integer deleted;
}