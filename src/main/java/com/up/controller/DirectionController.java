package com.up.controller;

import com.up.entity.Classify;
import com.up.entity.Direction;
import com.up.service.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DirectionController {

    @Autowired
    DirectionService directionService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/allDirections")
    @ResponseBody
    public List<Direction> getAllDirections(){
        return  directionService.allDirections();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping("/allClassify")
    @ResponseBody
    public List<Classify> allClassify(){
        return directionService.allClassify();
    }
}
