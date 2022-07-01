package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.PanelTemplate;
import io.datalake.plugins.common.base.domain.PanelTemplateExample;
import io.datalake.plugins.common.base.domain.PanelTemplateWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanelTemplateMapper {
    long countByExample(PanelTemplateExample example);

    int deleteByExample(PanelTemplateExample example);

    int deleteByPrimaryKey(String id);

    int insert(PanelTemplateWithBLOBs record);

    int insertSelective(PanelTemplateWithBLOBs record);

    List<PanelTemplateWithBLOBs> selectByExampleWithBLOBs(PanelTemplateExample example);

    List<PanelTemplate> selectByExample(PanelTemplateExample example);

    PanelTemplateWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PanelTemplateWithBLOBs record, @Param("example") PanelTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") PanelTemplateWithBLOBs record, @Param("example") PanelTemplateExample example);

    int updateByExample(@Param("record") PanelTemplate record, @Param("example") PanelTemplateExample example);

    int updateByPrimaryKeySelective(PanelTemplateWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PanelTemplateWithBLOBs record);

    int updateByPrimaryKey(PanelTemplate record);
}