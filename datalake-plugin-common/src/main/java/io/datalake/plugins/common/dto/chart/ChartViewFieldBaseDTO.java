package io.datalake.plugins.common.dto.chart;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author gin
 * @Date 2021/3/11 1:18 下午
 */
@Data
public class ChartViewFieldBaseDTO implements Serializable {
    private String id;

    private String tableId;

    private String originName;

    private String datalakeName;

    private String name;

    private String type;

    private Boolean checked;

    private Integer columnIndex;

    private Long lastSyncTime;

    private Integer deType;

    private String summary;

    private String sort;

    private Integer deExtractType;

    private String dateStyle;

    private String datePattern;

    private Integer extField;

    private String chartType;

    private ChartFieldCompareDTO compareCalc;

    private String logic;

    private String filterType;
}
