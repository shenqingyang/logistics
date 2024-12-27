package org.graduation.logistics.entity.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MiscellaneousExpensesChannel {
    private Integer channelId;
    private Integer miscellaneousExpensesId;
    private Double defaultPrice;
    private Double discount;
    private Timestamp expirationDate;
}