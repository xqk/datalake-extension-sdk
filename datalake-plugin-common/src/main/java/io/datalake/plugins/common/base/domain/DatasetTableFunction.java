package io.datalake.plugins.common.base.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class DatasetTableFunction implements Serializable {
    @ApiModelProperty("ID")
    private Long id;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("函数")
    private String func;
    @ApiModelProperty("库类型")
    private String dbType;
    @ApiModelProperty("函数类型")
    private Integer funcType;
    @ApiModelProperty("描述")
    private String desc;

    private static final long serialVersionUID = 1L;
}