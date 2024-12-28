package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class News {
    @TableId(type = IdType.AUTO)
    private Integer newsId;
    private String title;
    private String content;
    private Timestamp createTime;
    private Integer companyId;
}