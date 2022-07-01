package io.datalake.plugins.common.base.mapper;

import io.datalake.plugins.common.base.domain.DeDriverDetails;
import io.datalake.plugins.common.base.domain.DeDriverDetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeDriverDetailsMapper {
    long countByExample(DeDriverDetailsExample example);

    int deleteByExample(DeDriverDetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(DeDriverDetails record);

    int insertSelective(DeDriverDetails record);

    List<DeDriverDetails> selectByExampleWithBLOBs(DeDriverDetailsExample example);

    List<DeDriverDetails> selectByExample(DeDriverDetailsExample example);

    DeDriverDetails selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DeDriverDetails record, @Param("example") DeDriverDetailsExample example);

    int updateByExampleWithBLOBs(@Param("record") DeDriverDetails record, @Param("example") DeDriverDetailsExample example);

    int updateByExample(@Param("record") DeDriverDetails record, @Param("example") DeDriverDetailsExample example);

    int updateByPrimaryKeySelective(DeDriverDetails record);

    int updateByPrimaryKeyWithBLOBs(DeDriverDetails record);

    int updateByPrimaryKey(DeDriverDetails record);
}