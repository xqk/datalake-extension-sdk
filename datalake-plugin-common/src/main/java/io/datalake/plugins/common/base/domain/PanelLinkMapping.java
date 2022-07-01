package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class PanelLinkMapping implements Serializable {
    private Long id;

    private String resourceId;

    private Long userId;

    private String uuid;

    private static final long serialVersionUID = 1L;
}