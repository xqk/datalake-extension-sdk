package io.datalake.plugins.xpack.dept.dto.response;


import io.datalake.plugins.common.annotation.PluginResultMap;
import lombok.Data;

@Data
@PluginResultMap
public class XpackSysDept {

    private Long deptId;

    private Long pid;

    private Integer subCount;

    private String name;

    private Integer deptSort;

    private String createBy;

    private String updateBy;

    private Long createTime;

    private Long updateTime;

    private static final long serialVersionUID = 1L;
}
