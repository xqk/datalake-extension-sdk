package io.datalake.plugins.common.dto;

import io.datalake.plugins.common.annotation.PluginResultMap;
import lombok.Data;

import java.io.Serializable;

@Data
@PluginResultMap
public class PluginSimpleTreeNode implements Serializable {

    private Long id;

    private Long pid;
}
