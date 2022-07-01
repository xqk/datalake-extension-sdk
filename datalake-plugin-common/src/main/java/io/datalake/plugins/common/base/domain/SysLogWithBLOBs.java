package io.datalake.plugins.common.base.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SysLogWithBLOBs extends SysLog implements Serializable {
    private String position;

    private String remark;

    private static final long serialVersionUID = 1L;
}