package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class DeDriverDetails implements Serializable {
    private String id;

    private String deDriverId;

    private String fileName;

    private String version;

    private String driverClass;

    private static final long serialVersionUID = 1L;
}