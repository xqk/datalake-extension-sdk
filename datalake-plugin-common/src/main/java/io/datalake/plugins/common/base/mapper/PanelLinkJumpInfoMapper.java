package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.PanelLinkJumpInfo;
import io.datalake.plugins.common.base.domain.PanelLinkJumpInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanelLinkJumpInfoMapper {
    long countByExample(PanelLinkJumpInfoExample example);

    int deleteByExample(PanelLinkJumpInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(PanelLinkJumpInfo record);

    int insertSelective(PanelLinkJumpInfo record);

    List<PanelLinkJumpInfo> selectByExample(PanelLinkJumpInfoExample example);

    PanelLinkJumpInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PanelLinkJumpInfo record, @Param("example") PanelLinkJumpInfoExample example);

    int updateByExample(@Param("record") PanelLinkJumpInfo record, @Param("example") PanelLinkJumpInfoExample example);

    int updateByPrimaryKeySelective(PanelLinkJumpInfo record);

    int updateByPrimaryKey(PanelLinkJumpInfo record);
}