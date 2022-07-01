package io.datalake.plugins.xpack.theme.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class ThemeRequest implements Serializable{

    private ThemeDto themeDto;

    private List<ThemeItem> themeItems;
}
