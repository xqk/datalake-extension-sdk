package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeDriver implements Serializable {
    private String id;

    private String name;

    private Long createTime;

    private String type;

    private String driverClass;

    private String desc;

    private static final long serialVersionUID = 1L;
}