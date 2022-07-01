package io.datalake.plugins.xpack.role.service;

import io.datalake.plugins.common.entity.XpackGridRequest;
import io.datalake.plugins.common.service.PluginMenuService;
import io.datalake.plugins.xpack.role.dto.response.XpackRoleDto;
import io.datalake.plugins.xpack.role.dto.response.XpackRoleItemDto;

import java.util.List;


public abstract class RoleXpackService extends PluginMenuService {



    public abstract void save(XpackRoleDto dto);

    public abstract void delete(Long roleId);

    public abstract void update(XpackRoleDto dto);

    public abstract List<XpackRoleDto> query(XpackGridRequest request);

    public abstract List<XpackRoleItemDto> allRoles();

}
