package io.datalake.plugins.xpack.dept.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class XpackMoveDept implements Serializable {

    private Long resourceId;

    private Long targetId;
}
