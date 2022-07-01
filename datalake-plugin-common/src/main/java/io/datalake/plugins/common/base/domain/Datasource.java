package io.datalake.plugins.common.base.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Datasource implements Serializable {
    @ApiModelProperty("ID")
    private String id;
    @ApiModelProperty(value = "名称",required = true)
    private String name;
    @ApiModelProperty("描述")
    private String desc;
    @ApiModelProperty(value = "类型", required = true)
    private String type;
    @ApiModelProperty("创建时间")
    private Long createTime;
    @ApiModelProperty("更新时间")
    private Long updateTime;
    @ApiModelProperty("创建者")
    private String createBy;
    @ApiModelProperty("状态")
    private String status;
    @ApiModelProperty(value = "配置详情", required = true)
    private String configuration;

    private static final long serialVersionUID = 1L;
}