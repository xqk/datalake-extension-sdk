package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.DatasetTableUnion;
import io.datalake.plugins.common.base.domain.DatasetTableUnionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DatasetTableUnionMapper {
    long countByExample(DatasetTableUnionExample example);

    int deleteByExample(DatasetTableUnionExample example);

    int deleteByPrimaryKey(String id);

    int insert(DatasetTableUnion record);

    int insertSelective(DatasetTableUnion record);

    List<DatasetTableUnion> selectByExample(DatasetTableUnionExample example);

    DatasetTableUnion selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DatasetTableUnion record, @Param("example") DatasetTableUnionExample example);

    int updateByExample(@Param("record") DatasetTableUnion record, @Param("example") DatasetTableUnionExample example);

    int updateByPrimaryKeySelective(DatasetTableUnion record);

    int updateByPrimaryKey(DatasetTableUnion record);
}