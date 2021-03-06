package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class PanelLinkJumpInfo implements Serializable {
    private String id;

    private String linkJumpId;

    private String linkType;

    private String jumpType;

    private String targetPanelId;

    private String sourceFieldId;

    private String content;

    private Boolean checked;

    private Boolean attachParams;

    private String copyFrom;

    private String copyId;

    private static final long serialVersionUID = 1L;
}