package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class RolePermission {
    private Integer roleId;
    private Byte permissionCode;
    @TableLogic //逻辑删除
    private Integer deleted;
}