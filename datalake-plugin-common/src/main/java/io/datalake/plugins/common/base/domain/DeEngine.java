package io.datalake.plugins.common.base.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class DeEngine implements Serializable {
    private String id;

    private String name;

    private String desc;

    private String type;

    private Long createTime;

    private Long updateTime;

    private String createBy;

    private String status;

    @ApiModelProperty(value = "详细信息", required = true)
    private String configuration;

    private static final long serialVersionUID = 1L;
}