package org.graduation.logistics.entity.bo;

import lombok.Data;

import java.sql.Timestamp;
@Data
public class NewsBo {
    private Integer newsId;
    private String title;
    private String content;
    private Timestamp createTime;
    private Integer companyId;
    private String companyName;
}
