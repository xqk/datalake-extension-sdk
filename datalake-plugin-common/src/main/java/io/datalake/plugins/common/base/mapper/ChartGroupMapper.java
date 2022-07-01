package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.ChartGroup;
import io.datalake.plugins.common.base.domain.ChartGroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChartGroupMapper {
    long countByExample(ChartGroupExample example);

    int deleteByExample(ChartGroupExample example);

    int deleteByPrimaryKey(String id);

    int insert(ChartGroup record);

    int insertSelective(ChartGroup record);

    List<ChartGroup> selectByExample(ChartGroupExample example);

    ChartGroup selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ChartGroup record, @Param("example") ChartGroupExample example);

    int updateByExample(@Param("record") ChartGroup record, @Param("example") ChartGroupExample example);

    int updateByPrimaryKeySelective(ChartGroup record);

    int updateByPrimaryKey(ChartGroup record);
}