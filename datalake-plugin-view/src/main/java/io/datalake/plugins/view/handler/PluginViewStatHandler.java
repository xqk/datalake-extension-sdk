package io.datalake.plugins.view.handler;

import io.datalake.plugins.view.entity.PluginViewParam;
import io.datalake.plugins.view.service.ViewPluginService;

/**
 * 如果要对视图sql拼接重新调整 请实现这个接口
 */
public interface PluginViewStatHandler {


    String build(PluginViewParam pluginViewParam, ViewPluginService viewPluginService);
}
