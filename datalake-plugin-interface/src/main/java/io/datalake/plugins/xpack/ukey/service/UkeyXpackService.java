package io.datalake.plugins.xpack.ukey.service;

import io.datalake.plugins.common.service.PluginMenuService;
import io.datalake.plugins.xpack.ukey.dto.request.XpackUkeyDto;

import java.util.List;

public abstract class UkeyXpackService extends PluginMenuService {

    public abstract List<XpackUkeyDto> getUserKeysInfo(Long userId);

    public abstract XpackUkeyDto generateUserKey(Long userId);

    public abstract void deleteUserKey(Long id);

    /*public abstract void activeUserKey(Long id);

    public abstract void disableUserKey(Long id);*/

    public abstract void switchStatus(Long id);

    public abstract XpackUkeyDto getUserKey(String accessKey);


}
