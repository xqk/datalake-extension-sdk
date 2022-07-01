package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class PanelGroupExtendData implements Serializable {
    private String id;

    private String panelId;

    private String viewId;

    private String viewDetails;

    private static final long serialVersionUID = 1L;
}