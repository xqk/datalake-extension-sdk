package io.datalake.plugins.common.base.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class PanelShare implements Serializable {
    @ApiModelProperty("分享ID")
    private Long shareId;
    @ApiModelProperty("仪表板ID")
    private String panelGroupId;
    @ApiModelProperty("目标ID")
    private Long targetId;
    @ApiModelProperty("分享时间")
    private Long createTime;
    @ApiModelProperty("类型")
    private Integer type;

    private static final long serialVersionUID = 1L;
}