package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class PanelGroupExtend implements Serializable {
    private String id;

    private String panelId;

    private String templateId;

    private String templateVersion;

    private String templateDynamicData;

    private static final long serialVersionUID = 1L;
}