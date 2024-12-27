package org.graduation.logistics.entity.pojo;

import lombok.Data;

@Data
public class Staff {
    private Integer userId;
    private Integer roleId;
    private Integer subordinateId;
    private String department;
    private String post;
    private Byte subordinateType;
}