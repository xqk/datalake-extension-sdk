package io.datalake.plugins.xpack.oidc.service;

import io.datalake.plugins.common.service.PluginComponentService;
import io.datalake.plugins.xpack.display.dto.response.SysSettingDto;
import io.datalake.plugins.xpack.oidc.dto.SSOToken;
import io.datalake.plugins.xpack.oidc.dto.SSOUserInfo;

import java.util.List;
import java.util.Map;
public abstract class OidcXpackService extends PluginComponentService{

    public abstract List<SysSettingDto> oidcSettings();

    public abstract Boolean save(List<SysSettingDto> parameters);

    public Boolean isSuuportOIDC() {
        return false;
    }

    public abstract SSOToken requestSsoToken(Map<String,String> config, String code, String state);

    public abstract SSOUserInfo requestUserInfo(Map<String, String> config, String accessToken);

    public abstract void logout(String idToken);

}
