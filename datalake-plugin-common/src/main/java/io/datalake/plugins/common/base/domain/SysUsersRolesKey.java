package io.datalake.plugins.common.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysUsersRolesKey implements Serializable {
    private Long userId;

    private Long roleId;

    private static final long serialVersionUID = 1L;
}