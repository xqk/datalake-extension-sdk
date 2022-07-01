package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.PanelOuterParamsTargetViewInfo;
import io.datalake.plugins.common.base.domain.PanelOuterParamsTargetViewInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanelOuterParamsTargetViewInfoMapper {
    long countByExample(PanelOuterParamsTargetViewInfoExample example);

    int deleteByExample(PanelOuterParamsTargetViewInfoExample example);

    int deleteByPrimaryKey(String targetId);

    int insert(PanelOuterParamsTargetViewInfo record);

    int insertSelective(PanelOuterParamsTargetViewInfo record);

    List<PanelOuterParamsTargetViewInfo> selectByExample(PanelOuterParamsTargetViewInfoExample example);

    PanelOuterParamsTargetViewInfo selectByPrimaryKey(String targetId);

    int updateByExampleSelective(@Param("record") PanelOuterParamsTargetViewInfo record, @Param("example") PanelOuterParamsTargetViewInfoExample example);

    int updateByExample(@Param("record") PanelOuterParamsTargetViewInfo record, @Param("example") PanelOuterParamsTargetViewInfoExample example);

    int updateByPrimaryKeySelective(PanelOuterParamsTargetViewInfo record);

    int updateByPrimaryKey(PanelOuterParamsTargetViewInfo record);
}