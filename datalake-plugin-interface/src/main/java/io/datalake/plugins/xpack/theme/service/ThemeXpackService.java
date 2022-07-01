package io.datalake.plugins.xpack.theme.service;

import io.datalake.plugins.common.service.PluginComponentService;
import io.datalake.plugins.xpack.theme.dto.ThemeDto;
import io.datalake.plugins.xpack.theme.dto.ThemeItem;
import io.datalake.plugins.xpack.theme.dto.ThemeRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public abstract class ThemeXpackService extends PluginComponentService{

    public abstract List<ThemeDto> themes();

    public abstract void save(ThemeRequest request, MultipartFile file);

    public abstract List<ThemeItem> queryItems(int id);

    public abstract void deleteTheme(int id);
    
}
