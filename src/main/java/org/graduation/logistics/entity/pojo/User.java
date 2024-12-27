package org.graduation.logistics.entity.pojo;

import lombok.Data;

@Data
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private String email;
    private String phone;
    private String profile;
    private Byte category;
}
