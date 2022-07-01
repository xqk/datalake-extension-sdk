package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.PanelOuterParams;
import io.datalake.plugins.common.base.domain.PanelOuterParamsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanelOuterParamsMapper {
    long countByExample(PanelOuterParamsExample example);

    int deleteByExample(PanelOuterParamsExample example);

    int deleteByPrimaryKey(String paramsId);

    int insert(PanelOuterParams record);

    int insertSelective(PanelOuterParams record);

    List<PanelOuterParams> selectByExample(PanelOuterParamsExample example);

    PanelOuterParams selectByPrimaryKey(String paramsId);

    int updateByExampleSelective(@Param("record") PanelOuterParams record, @Param("example") PanelOuterParamsExample example);

    int updateByExample(@Param("record") PanelOuterParams record, @Param("example") PanelOuterParamsExample example);

    int updateByPrimaryKeySelective(PanelOuterParams record);

    int updateByPrimaryKey(PanelOuterParams record);
}