package io.datalake.plugins.xpack.role.dto.response;

import io.datalake.plugins.common.annotation.PluginResultMap;
import lombok.Data;

import java.io.Serializable;

@PluginResultMap
@Data
public class XpackRoleItemDto implements Serializable {

    private Long id;

    private String name;
}
