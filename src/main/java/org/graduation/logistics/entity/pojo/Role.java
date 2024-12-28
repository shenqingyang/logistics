package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Role {
    @TableId(type = IdType.AUTO)
    private Integer roleId;
    private String name;
    private Integer companyId;
}