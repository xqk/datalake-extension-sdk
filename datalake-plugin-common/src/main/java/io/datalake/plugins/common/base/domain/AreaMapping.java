package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class AreaMapping implements Serializable {
    private Long id;

    private String provinceName;

    private String provinceCode;

    private String cityName;

    private String cityCode;

    private String countyName;

    private String countyCode;

    private static final long serialVersionUID = 1L;
}