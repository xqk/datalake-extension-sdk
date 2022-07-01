package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.DeDriver;
import io.datalake.plugins.common.base.domain.DeDriverExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeDriverMapper {
    long countByExample(DeDriverExample example);

    int deleteByExample(DeDriverExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeDriver record);

    int insertSelective(DeDriver record);

    List<DeDriver> selectByExample(DeDriverExample example);

    DeDriver selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeDriver record, @Param("example") DeDriverExample example);

    int updateByExample(@Param("record") DeDriver record, @Param("example") DeDriverExample example);

    int updateByPrimaryKeySelective(DeDriver record);

    int updateByPrimaryKey(DeDriver record);
}