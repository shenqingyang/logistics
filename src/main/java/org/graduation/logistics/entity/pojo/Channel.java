package org.graduation.logistics.entity.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Channel {
    private Integer channelId;
    private String chineseName;
    private String englishName;
    private Double defaultPrice;
    private Timestamp expirationDate;
    private Double discount;
}