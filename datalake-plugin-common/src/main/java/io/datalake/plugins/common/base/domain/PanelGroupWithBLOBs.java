package io.datalake.plugins.common.base.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PanelGroupWithBLOBs extends PanelGroup implements Serializable {
    private String panelStyle;

    private String panelData;

    private static final long serialVersionUID = 1L;
}