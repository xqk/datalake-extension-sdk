package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class VAuthModel implements Serializable {
    private String id;

    private String pid;

    private String nodeType;

    private String modelType;

    private String modelInnerType;

    private String authType;

    private String createBy;

    private Long level;

    private Long mode;

    private String dataSourceId;

    private static final long serialVersionUID = 1L;
}