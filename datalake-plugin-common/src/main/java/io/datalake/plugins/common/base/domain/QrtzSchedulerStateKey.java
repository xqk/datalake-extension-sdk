package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class QrtzSchedulerStateKey implements Serializable {
    private String schedName;

    private String instanceName;

    private static final long serialVersionUID = 1L;
}