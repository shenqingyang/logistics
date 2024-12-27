package org.graduation.logistics.entity.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class News {
    private Integer newsId;
    private String title;
    private String content;
    private Timestamp createTime;
}