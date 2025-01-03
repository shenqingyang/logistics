package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
    @TableLogic //逻辑删除
    private Integer deleted;
}