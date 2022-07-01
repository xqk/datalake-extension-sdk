package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.PanelDesign;
import io.datalake.plugins.common.base.domain.PanelDesignExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanelDesignMapper {
    long countByExample(PanelDesignExample example);

    int deleteByExample(PanelDesignExample example);

    int deleteByPrimaryKey(String id);

    int insert(PanelDesign record);

    int insertSelective(PanelDesign record);

    List<PanelDesign> selectByExample(PanelDesignExample example);

    PanelDesign selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PanelDesign record, @Param("example") PanelDesignExample example);

    int updateByExample(@Param("record") PanelDesign record, @Param("example") PanelDesignExample example);

    int updateByPrimaryKeySelective(PanelDesign record);

    int updateByPrimaryKey(PanelDesign record);
}