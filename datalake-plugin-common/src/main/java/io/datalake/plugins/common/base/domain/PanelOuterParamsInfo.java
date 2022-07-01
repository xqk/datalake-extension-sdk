package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class PanelOuterParamsInfo implements Serializable {
    private String paramsInfoId;

    private String paramsId;

    private String paramName;

    private Boolean checked;

    private String copyFrom;

    private String copyId;

    private static final long serialVersionUID = 1L;
}