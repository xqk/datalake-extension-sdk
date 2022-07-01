package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class DatalakeCodeVersion implements Serializable {
    private Integer installedRank;

    private String description;

    private Date installedOn;

    private Boolean success;

    private static final long serialVersionUID = 1L;
}