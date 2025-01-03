package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class MasterWaybillWaybill {
    private Integer masterWaybillId;
    private Integer waybillId;
    @TableLogic //逻辑删除
    private Integer deleted;
}