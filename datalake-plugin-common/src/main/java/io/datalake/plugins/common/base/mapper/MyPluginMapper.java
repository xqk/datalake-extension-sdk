package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.MyPlugin;
import io.datalake.plugins.common.base.domain.MyPluginExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyPluginMapper {
    long countByExample(MyPluginExample example);

    int deleteByExample(MyPluginExample example);

    int deleteByPrimaryKey(Long pluginId);

    int insert(MyPlugin record);

    int insertSelective(MyPlugin record);

    List<MyPlugin> selectByExample(MyPluginExample example);

    MyPlugin selectByPrimaryKey(Long pluginId);

    int updateByExampleSelective(@Param("record") MyPlugin record, @Param("example") MyPluginExample example);

    int updateByExample(@Param("record") MyPlugin record, @Param("example") MyPluginExample example);

    int updateByPrimaryKeySelective(MyPlugin record);

    int updateByPrimaryKey(MyPlugin record);
}