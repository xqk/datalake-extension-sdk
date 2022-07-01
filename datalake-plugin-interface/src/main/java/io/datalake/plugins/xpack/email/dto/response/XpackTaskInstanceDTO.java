package io.datalake.plugins.xpack.email.dto.response;

import io.datalake.plugins.common.annotation.PluginResultMap;
import lombok.Data;

import java.io.Serializable;

@PluginResultMap
@Data
public class XpackTaskInstanceDTO implements Serializable{

    private Long taskId;

    private Long instanceId;

    private String taskName;

    private Long executeTime;

    private Integer status;

    private String info;
    
}
