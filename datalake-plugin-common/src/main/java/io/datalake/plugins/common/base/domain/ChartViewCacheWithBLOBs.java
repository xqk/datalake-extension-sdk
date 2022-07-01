package io.datalake.plugins.common.base.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ChartViewCacheWithBLOBs extends ChartViewCache implements Serializable {
    private String xAxis;

    private String xAxisExt;

    private String yAxis;

    private String yAxisExt;

    private String extStack;

    private String extBubble;

    private String customAttr;

    private String customStyle;

    private String customFilter;

    private String drillFields;

    private String senior;

    private String snapshot;

    private String viewFields;

    private static final long serialVersionUID = 1L;
}