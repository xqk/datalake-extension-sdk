package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.PanelLinkJumpTargetViewInfo;
import io.datalake.plugins.common.base.domain.PanelLinkJumpTargetViewInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanelLinkJumpTargetViewInfoMapper {
    long countByExample(PanelLinkJumpTargetViewInfoExample example);

    int deleteByExample(PanelLinkJumpTargetViewInfoExample example);

    int deleteByPrimaryKey(String targetId);

    int insert(PanelLinkJumpTargetViewInfo record);

    int insertSelective(PanelLinkJumpTargetViewInfo record);

    List<PanelLinkJumpTargetViewInfo> selectByExample(PanelLinkJumpTargetViewInfoExample example);

    PanelLinkJumpTargetViewInfo selectByPrimaryKey(String targetId);

    int updateByExampleSelective(@Param("record") PanelLinkJumpTargetViewInfo record, @Param("example") PanelLinkJumpTargetViewInfoExample example);

    int updateByExample(@Param("record") PanelLinkJumpTargetViewInfo record, @Param("example") PanelLinkJumpTargetViewInfoExample example);

    int updateByPrimaryKeySelective(PanelLinkJumpTargetViewInfo record);

    int updateByPrimaryKey(PanelLinkJumpTargetViewInfo record);
}