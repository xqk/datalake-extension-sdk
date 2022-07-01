package io.datalake.plugins.datasource.service;

import io.datalake.plugins.common.dto.datasource.DataSourceType;
import io.datalake.plugins.common.service.PluginComponentService;

public abstract class DatasourceService extends PluginComponentService {

    abstract public DataSourceType getDataSourceType();
}
