package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.SysAuthDetail;
import io.datalake.plugins.common.base.domain.SysAuthDetailExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysAuthDetailMapper {
    long countByExample(SysAuthDetailExample example);

    int deleteByExample(SysAuthDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysAuthDetail record);

    int insertSelective(SysAuthDetail record);

    List<SysAuthDetail> selectByExample(SysAuthDetailExample example);

    SysAuthDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysAuthDetail record, @Param("example") SysAuthDetailExample example);

    int updateByExample(@Param("record") SysAuthDetail record, @Param("example") SysAuthDetailExample example);

    int updateByPrimaryKeySelective(SysAuthDetail record);

    int updateByPrimaryKey(SysAuthDetail record);
}