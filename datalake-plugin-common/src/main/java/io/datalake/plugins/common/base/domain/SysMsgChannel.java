package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysMsgChannel implements Serializable {
    private Long msgChannelId;

    private String channelName;

    private String serviceName;

    private static final long serialVersionUID = 1L;
}