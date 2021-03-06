package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.DatasetGroup;
import io.datalake.plugins.common.base.domain.DatasetGroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DatasetGroupMapper {
    long countByExample(DatasetGroupExample example);

    int deleteByExample(DatasetGroupExample example);

    int deleteByPrimaryKey(String id);

    int insert(DatasetGroup record);

    int insertSelective(DatasetGroup record);

    List<DatasetGroup> selectByExample(DatasetGroupExample example);

    DatasetGroup selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DatasetGroup record, @Param("example") DatasetGroupExample example);

    int updateByExample(@Param("record") DatasetGroup record, @Param("example") DatasetGroupExample example);

    int updateByPrimaryKeySelective(DatasetGroup record);

    int updateByPrimaryKey(DatasetGroup record);
}