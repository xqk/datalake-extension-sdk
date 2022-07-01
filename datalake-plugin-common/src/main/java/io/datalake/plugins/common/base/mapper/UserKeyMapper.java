package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.UserKey;
import io.datalake.plugins.common.base.domain.UserKeyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserKeyMapper {
    long countByExample(UserKeyExample example);

    int deleteByExample(UserKeyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserKey record);

    int insertSelective(UserKey record);

    List<UserKey> selectByExample(UserKeyExample example);

    UserKey selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserKey record, @Param("example") UserKeyExample example);

    int updateByExample(@Param("record") UserKey record, @Param("example") UserKeyExample example);

    int updateByPrimaryKeySelective(UserKey record);

    int updateByPrimaryKey(UserKey record);
}