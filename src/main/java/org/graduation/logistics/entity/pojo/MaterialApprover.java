package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class MaterialApprover {
    private Integer materialId;
    private Integer approverId;
    private Timestamp completeTime;
    private Integer order;
    private Byte status;
    @TableLogic //逻辑删除
    private Integer deleted;
}
