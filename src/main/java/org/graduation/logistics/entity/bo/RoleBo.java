package org.graduation.logistics.entity.bo;

import lombok.Data;

import java.util.List;
@Data
public class RoleBo {
    private Integer roleId;
    private String roleName;
    private List<PermissionBo> permissions;
}
