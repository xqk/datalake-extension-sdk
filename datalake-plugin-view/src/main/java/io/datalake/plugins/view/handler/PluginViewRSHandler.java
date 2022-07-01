package io.datalake.plugins.view.handler;

import io.datalake.plugins.view.entity.PluginViewParam;

import java.util.List;

/**
 * 如果要对视图结果重新组织 请实现这个接口
 * @param <E>
 */
public interface PluginViewRSHandler<E> {

    E format(PluginViewParam param, List<String[]> data, boolean isDrill);
}
