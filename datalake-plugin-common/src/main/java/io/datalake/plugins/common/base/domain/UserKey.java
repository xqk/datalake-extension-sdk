package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserKey implements Serializable {
    private Long id;

    private Long userId;

    private String accessKey;

    private String secretKey;

    private Long createTime;

    private String status;

    private static final long serialVersionUID = 1L;
}