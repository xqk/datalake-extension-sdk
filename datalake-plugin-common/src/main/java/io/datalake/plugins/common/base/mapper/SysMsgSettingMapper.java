package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.SysMsgSetting;
import io.datalake.plugins.common.base.domain.SysMsgSettingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMsgSettingMapper {
    long countByExample(SysMsgSettingExample example);

    int deleteByExample(SysMsgSettingExample example);

    int deleteByPrimaryKey(Long msgSettingId);

    int insert(SysMsgSetting record);

    int insertSelective(SysMsgSetting record);

    List<SysMsgSetting> selectByExample(SysMsgSettingExample example);

    SysMsgSetting selectByPrimaryKey(Long msgSettingId);

    int updateByExampleSelective(@Param("record") SysMsgSetting record, @Param("example") SysMsgSettingExample example);

    int updateByExample(@Param("record") SysMsgSetting record, @Param("example") SysMsgSettingExample example);

    int updateByPrimaryKeySelective(SysMsgSetting record);

    int updateByPrimaryKey(SysMsgSetting record);
}