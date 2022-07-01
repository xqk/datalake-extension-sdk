package io.datalake.plugins.xpack.auth.service;

import io.datalake.plugins.common.service.PluginMenuService;
import io.datalake.plugins.xpack.auth.dto.request.XpackBaseTreeRequest;
import io.datalake.plugins.xpack.auth.dto.request.XpackSysAuthRequest;
import io.datalake.plugins.xpack.auth.dto.response.XpackSysAuthDetail;
import io.datalake.plugins.xpack.auth.dto.response.XpackSysAuthDetailDTO;
import io.datalake.plugins.xpack.auth.dto.response.XpackVAuthModelDTO;

import java.util.List;
import java.util.Map;

public abstract class AuthXpackService extends PluginMenuService {

    public abstract List<XpackVAuthModelDTO> searchAuthModelTree(XpackBaseTreeRequest request, Long userId, Boolean isAdmin);

    public abstract Map<String, List<XpackSysAuthDetailDTO>> searchAuthDetails(XpackSysAuthRequest request);

    public abstract List<XpackSysAuthDetail> searchAuthDetailsModel(String authType);

    public abstract void authChange(XpackSysAuthRequest request, Long userId, String userName, Boolean isAdmin);
}
