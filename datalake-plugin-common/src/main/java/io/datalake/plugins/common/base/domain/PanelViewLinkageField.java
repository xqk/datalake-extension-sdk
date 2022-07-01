package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class PanelViewLinkageField implements Serializable {
    private String id;

    private String linkageId;

    private String sourceField;

    private String targetField;

    private Long updateTime;

    private String copyFrom;

    private String copyId;

    private static final long serialVersionUID = 1L;
}