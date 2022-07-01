package io.datalake.plugins.common.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class GlobalTaskEntity implements Serializable{
    
    private Long taskId;

    private String taskName;

    private String taskType;

    private Long startTime;

    private Long endTime;

    private Integer rateType;

    private String rateVal;

    private Long creator;

    private Long createTime;
}
