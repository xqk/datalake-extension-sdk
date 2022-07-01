package io.datalake.plugins.xpack.theme.dto;

import io.datalake.plugins.common.annotation.PluginResultMap;
import lombok.Data;

import java.io.Serializable;

@Data
@PluginResultMap
public class ThemeItem implements Serializable{

    private String key;

    private String val;
    
}
