package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.DatalakeCodeVersion;
import io.datalake.plugins.common.base.domain.DatalakeCodeVersionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DatalakeCodeVersionMapper {
    long countByExample(DatalakeCodeVersionExample example);

    int deleteByExample(DatalakeCodeVersionExample example);

    int deleteByPrimaryKey(Integer installedRank);

    int insert(DatalakeCodeVersion record);

    int insertSelective(DatalakeCodeVersion record);

    List<DatalakeCodeVersion> selectByExample(DatalakeCodeVersionExample example);

    DatalakeCodeVersion selectByPrimaryKey(Integer installedRank);

    int updateByExampleSelective(@Param("record") DatalakeCodeVersion record, @Param("example") DatalakeCodeVersionExample example);

    int updateByExample(@Param("record") DatalakeCodeVersion record, @Param("example") DatalakeCodeVersionExample example);

    int updateByPrimaryKeySelective(DatalakeCodeVersion record);

    int updateByPrimaryKey(DatalakeCodeVersion record);
}