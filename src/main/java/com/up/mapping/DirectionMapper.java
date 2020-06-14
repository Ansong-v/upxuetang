package com.up.mapping;

import com.up.entity.Classify;
import com.up.entity.Direction;
import com.up.entity.DirectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirectionMapper {
    long countByExample(DirectionExample example);

    int deleteByExample(DirectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Direction record);

    int insertSelective(Direction record);

    List<Direction> selectByExample(DirectionExample example);

    List<Classify> allClassify();

    Direction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Direction record, @Param("example") DirectionExample example);

    int updateByExample(@Param("record") Direction record, @Param("example") DirectionExample example);

    int updateByPrimaryKeySelective(Direction record);

    int updateByPrimaryKey(Direction record);
}