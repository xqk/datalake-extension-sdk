package io.datalake.plugins.xpack.email.dto.response;

import io.datalake.plugins.common.annotation.PluginResultMap;
import lombok.Data;

import java.io.Serializable;

@PluginResultMap
@Data
public class XpackTaskGridDTO implements Serializable {

    private Long taskId;

    private String taskName;

    private Long instanceId;

    private Long lastSendTime;

    private Integer lastSendStatus;

    private Long nextExecTime;

    private Long creator;

    private String creatorName;

    private Long createTime;

    private Integer rateType;

    private String rateVal;

    private Long endTime;

}
