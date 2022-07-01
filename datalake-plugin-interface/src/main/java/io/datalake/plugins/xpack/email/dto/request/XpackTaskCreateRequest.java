package io.datalake.plugins.xpack.email.dto.request;

import io.datalake.plugins.common.annotation.PluginResultMap;
import lombok.Data;

import java.io.Serializable;

@PluginResultMap
@Data
public class XpackTaskCreateRequest implements Serializable{
    
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
