package io.datalake.plugins.common.base.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class VAuthModelWithBLOBs extends VAuthModel implements Serializable {
    private String name;

    private String label;

    private static final long serialVersionUID = 1L;
}