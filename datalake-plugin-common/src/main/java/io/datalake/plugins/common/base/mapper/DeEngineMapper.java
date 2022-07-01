package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.DeEngine;
import io.datalake.plugins.common.base.domain.DeEngineExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeEngineMapper {
    long countByExample(DeEngineExample example);

    int deleteByExample(DeEngineExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeEngine record);

    int insertSelective(DeEngine record);

    List<DeEngine> selectByExampleWithBLOBs(DeEngineExample example);

    List<DeEngine> selectByExample(DeEngineExample example);

    DeEngine selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeEngine record, @Param("example") DeEngineExample example);

    int updateByExampleWithBLOBs(@Param("record") DeEngine record, @Param("example") DeEngineExample example);

    int updateByExample(@Param("record") DeEngine record, @Param("example") DeEngineExample example);

    int updateByPrimaryKeySelective(DeEngine record);

    int updateByPrimaryKeyWithBLOBs(DeEngine record);

    int updateByPrimaryKey(DeEngine record);
}