package io.datalake.plugins.xpack.auth.dto.response;

import io.datalake.plugins.common.annotation.PluginResultMap;
import lombok.Data;

import java.util.List;

@Data
@PluginResultMap
public class XpackVAuthModelDTO extends XpackVAuthModel{

    private List<XpackVAuthModelDTO> children;

    private Boolean leaf;

    private Integer childrenCount;

    private Boolean hasChildren;
}
