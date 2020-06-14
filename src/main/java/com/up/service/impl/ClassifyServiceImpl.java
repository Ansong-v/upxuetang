package com.up.service.impl;

import com.up.entity.Classify;
import com.up.entity.ClassifyExample;
import com.up.mapping.ClassifyMapper;
import com.up.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    ClassifyMapper classifyMapper;

    @Override
    public List<Classify> allClassify() {
        ClassifyExample classifyExample=new ClassifyExample();
        return classifyMapper.selectByExample(classifyExample);
    }

    @Override
    public boolean getClassifyBydirectionid(Integer directionid) {
        ClassifyExample classifyExample=new ClassifyExample();
        classifyExample.createCriteria().andDirectionidEqualTo(directionid);
        List<Classify> classifies=classifyMapper.selectByExample(classifyExample);
        return classifies.size()>0?true:false;
    }
}
