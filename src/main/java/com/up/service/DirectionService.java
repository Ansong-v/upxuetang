package com.up.service;

import com.up.entity.Classify;
import com.up.entity.Direction;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DirectionService {
    List<Direction> allDirections();

    List<Classify> allClassify();
}
