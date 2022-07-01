package io.datalake.plugins.common.base.mapper;


import io.datalake.plugins.common.base.domain.VAuthModel;
import io.datalake.plugins.common.base.domain.VAuthModelExample;
import io.datalake.plugins.common.base.domain.VAuthModelWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VAuthModelMapper {
    long countByExample(VAuthModelExample example);

    int deleteByExample(VAuthModelExample example);

    int insert(VAuthModelWithBLOBs record);

    int insertSelective(VAuthModelWithBLOBs record);

    List<VAuthModelWithBLOBs> selectByExampleWithBLOBs(VAuthModelExample example);

    List<VAuthModel> selectByExample(VAuthModelExample example);

    int updateByExampleSelective(@Param("record") VAuthModelWithBLOBs record, @Param("example") VAuthModelExample example);

    int updateByExampleWithBLOBs(@Param("record") VAuthModelWithBLOBs record, @Param("example") VAuthModelExample example);

    int updateByExample(@Param("record") VAuthModel record, @Param("example") VAuthModelExample example);
}