package com.up.controller;

import com.up.entity.Classify;
import com.up.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ClassifyController {

    @Autowired
    ClassifyService classifyService;

//    @CrossOrigin(origins = "*")
//    @RequestMapping("/allClassify")
//    @ResponseBody
//    public List<Classify> allClassify(){
//        return classifyService.allClassify();
//    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/Classify")
    @ResponseBody
    public List<Classify> getClassify(Integer directionid){
        boolean b=classifyService.getClassifyBydirectionid(1);
        List<Classify> us=classifyService.allClassify();
        return us;
    }
}
