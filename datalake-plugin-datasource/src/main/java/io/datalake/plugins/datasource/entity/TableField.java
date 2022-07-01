package io.datalake.plugins.datasource.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TableField {
    private String fieldName;
    private String remarks;
    private String fieldType;
    private int fieldSize;

}
