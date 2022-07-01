package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysDictItem implements Serializable {
    private String id;

    private String dictId;

    private String itemText;

    private String itemValue;

    private String description;

    private Integer sortOrder;

    private String status;

    private String createBy;

    private Long createTime;

    private String updateBy;

    private Long updateTime;

    private static final long serialVersionUID = 1L;
}