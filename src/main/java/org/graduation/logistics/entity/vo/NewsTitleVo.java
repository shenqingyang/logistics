package org.graduation.logistics.entity.vo;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class NewsTitleVo {
    private Integer newsId;
    private String title;
    private Timestamp createTime;
    private Integer companyId;
    private String companyName;
}
