package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.PanelStore;
import io.datalake.plugins.common.base.domain.PanelStoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PanelStoreMapper {
    long countByExample(PanelStoreExample example);

    int deleteByExample(PanelStoreExample example);

    int deleteByPrimaryKey(Long storeId);

    int insert(PanelStore record);

    int insertSelective(PanelStore record);

    List<PanelStore> selectByExample(PanelStoreExample example);

    PanelStore selectByPrimaryKey(Long storeId);

    int updateByExampleSelective(@Param("record") PanelStore record, @Param("example") PanelStoreExample example);

    int updateByExample(@Param("record") PanelStore record, @Param("example") PanelStoreExample example);

    int updateByPrimaryKeySelective(PanelStore record);

    int updateByPrimaryKey(PanelStore record);
}