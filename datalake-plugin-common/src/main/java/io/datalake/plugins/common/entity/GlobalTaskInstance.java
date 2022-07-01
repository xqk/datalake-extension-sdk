package io.datalake.plugins.common.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class GlobalTaskInstance implements Serializable{

    private Long instanceId;

    private Long taskId;

    private Long executeTime;

    private Long finishTime;

    private Integer status;

    private String info;
    
}
