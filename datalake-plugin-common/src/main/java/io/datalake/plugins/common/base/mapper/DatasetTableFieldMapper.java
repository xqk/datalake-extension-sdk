package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.DatasetTableField;
import io.datalake.plugins.common.base.domain.DatasetTableFieldExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DatasetTableFieldMapper {
    long countByExample(DatasetTableFieldExample example);

    int deleteByExample(DatasetTableFieldExample example);

    int deleteByPrimaryKey(String id);

    int insert(DatasetTableField record);

    int insertSelective(DatasetTableField record);

    List<DatasetTableField> selectByExample(DatasetTableFieldExample example);

    DatasetTableField selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DatasetTableField record, @Param("example") DatasetTableFieldExample example);

    int updateByExample(@Param("record") DatasetTableField record, @Param("example") DatasetTableFieldExample example);

    int updateByPrimaryKeySelective(DatasetTableField record);

    int updateByPrimaryKey(DatasetTableField record);
}