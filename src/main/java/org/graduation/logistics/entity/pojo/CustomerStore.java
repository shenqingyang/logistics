package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class CustomerStore {
    private Integer userId;
    private Integer storeId;
    private Double surplus;
    private Integer level;
    private Boolean enabled;
    @TableLogic //逻辑删除
    private Integer deleted;
}