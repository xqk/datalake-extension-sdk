package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class PanelGroup implements Serializable {
    private String id;

    private String name;

    private String pid;

    private Integer level;

    private String nodeType;

    private String createBy;

    private Long createTime;

    private String panelType;

    private String source;

    private String extend1;

    private String extend2;

    private String remark;

    private Boolean mobileLayout;

    private String status;

    private static final long serialVersionUID = 1L;
}