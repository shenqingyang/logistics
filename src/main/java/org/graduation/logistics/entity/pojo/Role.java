package org.graduation.logistics.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

@Data
public class Role {
    @TableId(type = IdType.AUTO)
    private Integer roleId;
    private String name;
    private Integer companyId;
    @TableLogic //逻辑删除
    private Integer deleted;
}