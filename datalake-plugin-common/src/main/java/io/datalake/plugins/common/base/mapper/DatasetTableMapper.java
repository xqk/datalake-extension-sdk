package io.datalake.plugins.common.base.mapper;


import io.datalake.plugins.common.base.domain.DatasetTable;
import io.datalake.plugins.common.base.domain.DatasetTableExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DatasetTableMapper {
    long countByExample(DatasetTableExample example);

    int deleteByExample(DatasetTableExample example);

    int deleteByPrimaryKey(String id);

    int insert(DatasetTable record);

    int insertSelective(DatasetTable record);

    List<DatasetTable> selectByExampleWithBLOBs(DatasetTableExample example);

    List<DatasetTable> selectByExample(DatasetTableExample example);

    DatasetTable selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DatasetTable record, @Param("example") DatasetTableExample example);

    int updateByExampleWithBLOBs(@Param("record") DatasetTable record, @Param("example") DatasetTableExample example);

    int updateByExample(@Param("record") DatasetTable record, @Param("example") DatasetTableExample example);

    int updateByPrimaryKeySelective(DatasetTable record);

    int updateByPrimaryKeyWithBLOBs(DatasetTable record);

    int updateByPrimaryKey(DatasetTable record);
}