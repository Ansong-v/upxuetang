package com.up.service.impl;

import com.up.entity.Classify;
import com.up.entity.Direction;
import com.up.entity.DirectionExample;
import com.up.mapping.DirectionMapper;
import com.up.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectionServiceImpl implements DirectionService {

    @Autowired
    DirectionMapper directionMapper;

    @Override
    public List<Direction> allDirections() {
        DirectionExample directionExample=new DirectionExample();
        return directionMapper.selectByExample(directionExample);
    }

    @Override
    public List<Classify> allClassify() {
        return directionMapper.allClassify();
    }
}
