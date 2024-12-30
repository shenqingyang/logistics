package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    @TableId(type = IdType.AUTO)
    private Integer userId;
    private String userName;
    private String password;
    private String loginAccount;
    private String phone;
    private String profile;
    private String department;
    private String post;
    private Integer roleId;
    private Integer warehouseId;
    private Integer storeId;
    private Integer companyId;
}
