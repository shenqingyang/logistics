package org.graduation.logistics.entity.enums;

public enum PermissionCodeEnum {
    MANAGE_ROLE(1,"管理公司角色"),
    MANAGE_COMPANY_STUFF(2,"管理公司人员"),
    MANAGE_STORE_STUFF(3,"管理店员"),
    MANAGE_WAREHOUSE_STUFF(4,"管理仓库人员"),
    ;

    private Integer code;
    private String name;

    PermissionCodeEnum(Integer code,String name) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
    public String getName() {return name;}
}
