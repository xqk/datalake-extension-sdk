package io.datalake.plugins.xpack.theme.dto;

import io.datalake.plugins.common.annotation.PluginResultMap;
import lombok.Data;

import java.io.Serializable;

@Data
@PluginResultMap
public class ThemeDto implements Serializable{

    private Integer id;

    private String name;

    private String imgId;

    private String img;

    private Boolean status;
    
}
