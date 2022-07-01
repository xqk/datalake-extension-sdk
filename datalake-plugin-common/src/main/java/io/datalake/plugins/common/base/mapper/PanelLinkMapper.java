package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.PanelLink;
import io.datalake.plugins.common.base.domain.PanelLinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanelLinkMapper {
    long countByExample(PanelLinkExample example);

    int deleteByExample(PanelLinkExample example);

    int insert(PanelLink record);

    int insertSelective(PanelLink record);

    List<PanelLink> selectByExample(PanelLinkExample example);

    int updateByExampleSelective(@Param("record") PanelLink record, @Param("example") PanelLinkExample example);

    int updateByExample(@Param("record") PanelLink record, @Param("example") PanelLinkExample example);
}