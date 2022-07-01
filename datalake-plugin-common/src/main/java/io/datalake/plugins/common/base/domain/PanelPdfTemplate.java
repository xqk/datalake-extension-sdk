package io.datalake.plugins.common.base.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class PanelPdfTemplate implements Serializable {
    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("创建人")
    private String createUser;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("模板内容")
    private String templateContent;

    private static final long serialVersionUID = 1L;
}
