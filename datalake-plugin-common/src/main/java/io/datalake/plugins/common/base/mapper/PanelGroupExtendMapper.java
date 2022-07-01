package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.PanelGroupExtend;
import io.datalake.plugins.common.base.domain.PanelGroupExtendExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanelGroupExtendMapper {
    long countByExample(PanelGroupExtendExample example);

    int deleteByExample(PanelGroupExtendExample example);

    int deleteByPrimaryKey(String id);

    int insert(PanelGroupExtend record);

    int insertSelective(PanelGroupExtend record);

    List<PanelGroupExtend> selectByExampleWithBLOBs(PanelGroupExtendExample example);

    List<PanelGroupExtend> selectByExample(PanelGroupExtendExample example);

    PanelGroupExtend selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PanelGroupExtend record, @Param("example") PanelGroupExtendExample example);

    int updateByExampleWithBLOBs(@Param("record") PanelGroupExtend record, @Param("example") PanelGroupExtendExample example);

    int updateByExample(@Param("record") PanelGroupExtend record, @Param("example") PanelGroupExtendExample example);

    int updateByPrimaryKeySelective(PanelGroupExtend record);

    int updateByPrimaryKeyWithBLOBs(PanelGroupExtend record);

    int updateByPrimaryKey(PanelGroupExtend record);
}