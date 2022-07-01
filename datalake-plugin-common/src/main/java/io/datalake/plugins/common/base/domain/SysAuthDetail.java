package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysAuthDetail implements Serializable {
    private String id;

    private String authId;

    private String privilegeName;

    private Integer privilegeType;

    private Integer privilegeValue;

    private String privilegeExtend;

    private String remark;

    private String createUser;

    private Long createTime;

    private Long updateTime;

    private static final long serialVersionUID = 1L;
}