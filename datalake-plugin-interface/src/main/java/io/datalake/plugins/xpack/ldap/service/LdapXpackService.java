package io.datalake.plugins.xpack.ldap.service;

import io.datalake.plugins.common.entity.XpackLdapUserEntity;
import io.datalake.plugins.common.service.PluginComponentService;
import io.datalake.plugins.xpack.display.dto.response.SysSettingDto;
import io.datalake.plugins.xpack.ldap.dto.request.LdapValidateRequest;
import io.datalake.plugins.xpack.ldap.dto.response.LdapInfo;
import io.datalake.plugins.xpack.ldap.dto.response.ValidateResult;

import java.util.List;
public abstract class LdapXpackService extends PluginComponentService /* extends PluginMenuService */{

    public abstract LdapInfo info();

    public abstract void save(List<SysSettingDto> settings);

    public abstract void testConn();

    public abstract void testLogin();

    public abstract Boolean isOpen();

    public abstract List<XpackLdapUserEntity> users();

    public abstract ValidateResult login(LdapValidateRequest request);
    
}
