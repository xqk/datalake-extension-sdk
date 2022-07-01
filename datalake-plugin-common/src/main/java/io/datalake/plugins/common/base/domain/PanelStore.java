package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class PanelStore implements Serializable {
    private Long storeId;

    private String panelGroupId;

    private Long userId;

    private Long createTime;

    private static final long serialVersionUID = 1L;
}