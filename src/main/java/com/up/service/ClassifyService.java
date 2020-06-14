package com.up.service;

import com.up.entity.Classify;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassifyService {
    List<Classify> allClassify();
    boolean getClassifyBydirectionid(Integer directionid);
}
