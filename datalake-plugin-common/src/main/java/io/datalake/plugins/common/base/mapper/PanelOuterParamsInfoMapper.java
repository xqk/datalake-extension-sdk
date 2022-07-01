package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.PanelOuterParamsInfo;
import io.datalake.plugins.common.base.domain.PanelOuterParamsInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanelOuterParamsInfoMapper {
    long countByExample(PanelOuterParamsInfoExample example);

    int deleteByExample(PanelOuterParamsInfoExample example);

    int deleteByPrimaryKey(String paramsInfoId);

    int insert(PanelOuterParamsInfo record);

    int insertSelective(PanelOuterParamsInfo record);

    List<PanelOuterParamsInfo> selectByExample(PanelOuterParamsInfoExample example);

    PanelOuterParamsInfo selectByPrimaryKey(String paramsInfoId);

    int updateByExampleSelective(@Param("record") PanelOuterParamsInfo record, @Param("example") PanelOuterParamsInfoExample example);

    int updateByExample(@Param("record") PanelOuterParamsInfo record, @Param("example") PanelOuterParamsInfoExample example);

    int updateByPrimaryKeySelective(PanelOuterParamsInfo record);

    int updateByPrimaryKey(PanelOuterParamsInfo record);
}