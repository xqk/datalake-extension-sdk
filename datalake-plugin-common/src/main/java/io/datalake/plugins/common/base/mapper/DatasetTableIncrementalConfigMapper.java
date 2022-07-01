package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.DatasetTableIncrementalConfig;
import io.datalake.plugins.common.base.domain.DatasetTableIncrementalConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DatasetTableIncrementalConfigMapper {
    long countByExample(DatasetTableIncrementalConfigExample example);

    int deleteByExample(DatasetTableIncrementalConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(DatasetTableIncrementalConfig record);

    int insertSelective(DatasetTableIncrementalConfig record);

    List<DatasetTableIncrementalConfig> selectByExample(DatasetTableIncrementalConfigExample example);

    DatasetTableIncrementalConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DatasetTableIncrementalConfig record, @Param("example") DatasetTableIncrementalConfigExample example);

    int updateByExample(@Param("record") DatasetTableIncrementalConfig record, @Param("example") DatasetTableIncrementalConfigExample example);

    int updateByPrimaryKeySelective(DatasetTableIncrementalConfig record);

    int updateByPrimaryKey(DatasetTableIncrementalConfig record);
}