package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.SysBackgroundImage;
import io.datalake.plugins.common.base.domain.SysBackgroundImageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysBackgroundImageMapper {
    long countByExample(SysBackgroundImageExample example);

    int deleteByExample(SysBackgroundImageExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysBackgroundImage record);

    int insertSelective(SysBackgroundImage record);

    List<SysBackgroundImage> selectByExampleWithBLOBs(SysBackgroundImageExample example);

    List<SysBackgroundImage> selectByExample(SysBackgroundImageExample example);

    SysBackgroundImage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysBackgroundImage record, @Param("example") SysBackgroundImageExample example);

    int updateByExampleWithBLOBs(@Param("record") SysBackgroundImage record, @Param("example") SysBackgroundImageExample example);

    int updateByExample(@Param("record") SysBackgroundImage record, @Param("example") SysBackgroundImageExample example);

    int updateByPrimaryKeySelective(SysBackgroundImage record);

    int updateByPrimaryKeyWithBLOBs(SysBackgroundImage record);

    int updateByPrimaryKey(SysBackgroundImage record);
}