package io.datalake.plugins.view.entity;

import lombok.Data;

@Data
public class PluginViewSet {

    private String type;

    private String info;

    private String dsType;

    private Integer mode;

    private String tabelId;
}
