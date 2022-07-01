package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysAuth implements Serializable {
    private String id;

    private String authSource;

    private String authSourceType;

    private String authTarget;

    private String authTargetType;

    private Long authTime;

    private String authDetails;

    private String authUser;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}