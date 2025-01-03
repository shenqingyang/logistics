package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class UserRole {
    private Integer userId;
    private Integer roleId;
    @TableLogic //逻辑删除
    private Integer deleted;
}
