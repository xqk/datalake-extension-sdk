package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.SysMsgType;
import io.datalake.plugins.common.base.domain.SysMsgTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMsgTypeMapper {
    long countByExample(SysMsgTypeExample example);

    int deleteByExample(SysMsgTypeExample example);

    int deleteByPrimaryKey(Long msgTypeId);

    int insert(SysMsgType record);

    int insertSelective(SysMsgType record);

    List<SysMsgType> selectByExample(SysMsgTypeExample example);

    SysMsgType selectByPrimaryKey(Long msgTypeId);

    int updateByExampleSelective(@Param("record") SysMsgType record, @Param("example") SysMsgTypeExample example);

    int updateByExample(@Param("record") SysMsgType record, @Param("example") SysMsgTypeExample example);

    int updateByPrimaryKeySelective(SysMsgType record);

    int updateByPrimaryKey(SysMsgType record);
}