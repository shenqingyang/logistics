package org.graduation.logistics.entity.pojo;

import lombok.Data;

@Data
public class CustomerStore {
    private Integer customerId;
    private Integer storeId;
    private Double surplus;
    private Integer level;
    private Boolean enabled;
}