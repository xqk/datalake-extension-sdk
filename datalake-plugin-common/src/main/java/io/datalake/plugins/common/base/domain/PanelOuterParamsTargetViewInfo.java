package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class PanelOuterParamsTargetViewInfo implements Serializable {
    private String targetId;

    private String paramsInfoId;

    private String targetViewId;

    private String targetFieldId;

    private String copyFrom;

    private String copyId;

    private static final long serialVersionUID = 1L;
}