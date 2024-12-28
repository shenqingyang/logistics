package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Channel {
    @TableId(type = IdType.AUTO)
    private Integer channelId;
    private String chineseName;
    private String englishName;
    private Double defaultPrice;
    private Timestamp expirationDate;
    private Double discount;
    private Integer companyId;
}