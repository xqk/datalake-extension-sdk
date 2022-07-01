package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.PanelLinkJump;
import io.datalake.plugins.common.base.domain.PanelLinkJumpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanelLinkJumpMapper {
    long countByExample(PanelLinkJumpExample example);

    int deleteByExample(PanelLinkJumpExample example);

    int deleteByPrimaryKey(String id);

    int insert(PanelLinkJump record);

    int insertSelective(PanelLinkJump record);

    List<PanelLinkJump> selectByExample(PanelLinkJumpExample example);

    PanelLinkJump selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PanelLinkJump record, @Param("example") PanelLinkJumpExample example);

    int updateByExample(@Param("record") PanelLinkJump record, @Param("example") PanelLinkJumpExample example);

    int updateByPrimaryKeySelective(PanelLinkJump record);

    int updateByPrimaryKey(PanelLinkJump record);
}