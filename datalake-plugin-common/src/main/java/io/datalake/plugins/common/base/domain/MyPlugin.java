package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class MyPlugin implements Serializable {
    private Long pluginId;

    private String name;

    private String store;

    private Boolean free;

    private Integer cost;

    private String category;

    private String descript;

    private String version;

    private Integer installType;

    private String creator;

    private Boolean loadMybatis;

    private Long releaseTime;

    private Long installTime;

    private String moduleName;

    private String icon;

    private String dsType;

    private static final long serialVersionUID = 1L;
}