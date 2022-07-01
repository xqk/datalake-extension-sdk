package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.DatasetTableFunction;
import io.datalake.plugins.common.base.domain.DatasetTableFunctionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DatasetTableFunctionMapper {
    long countByExample(DatasetTableFunctionExample example);

    int deleteByExample(DatasetTableFunctionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DatasetTableFunction record);

    int insertSelective(DatasetTableFunction record);

    List<DatasetTableFunction> selectByExampleWithBLOBs(DatasetTableFunctionExample example);

    List<DatasetTableFunction> selectByExample(DatasetTableFunctionExample example);

    DatasetTableFunction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DatasetTableFunction record, @Param("example") DatasetTableFunctionExample example);

    int updateByExampleWithBLOBs(@Param("record") DatasetTableFunction record, @Param("example") DatasetTableFunctionExample example);

    int updateByExample(@Param("record") DatasetTableFunction record, @Param("example") DatasetTableFunctionExample example);

    int updateByPrimaryKeySelective(DatasetTableFunction record);

    int updateByPrimaryKeyWithBLOBs(DatasetTableFunction record);

    int updateByPrimaryKey(DatasetTableFunction record);
}