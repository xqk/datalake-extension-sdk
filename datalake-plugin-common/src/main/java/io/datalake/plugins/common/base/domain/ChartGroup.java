package io.datalake.plugins.common.base.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ChartGroup implements Serializable {
    @ApiModelProperty("ID")
    private String id;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("父ID")
    private String pid;
    @ApiModelProperty("级别")
    private Integer level;
    @ApiModelProperty("类型")
    private String type;
    @ApiModelProperty("创建者")
    private String createBy;
    @ApiModelProperty("创建时间")
    private Long createTime;

    private static final long serialVersionUID = 1L;
}