package com.up.entity;

import java.util.List;

public class Direction {
    private Integer id;

    private String directionname;

    private String directionicon;

    private List<Classify> classify;


    public List<Classify> getClassify() {
        return classify;
    }

    public void setClassify(List<Classify> classify) {
        this.classify = classify;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDirectionname() {
        return directionname;
    }

    public void setDirectionname(String directionname) {
        this.directionname = directionname == null ? null : directionname.trim();
    }

    public String getDirectionicon() {
        return directionicon;
    }

    public void setDirectionicon(String directionicon) {
        this.directionicon = directionicon == null ? null : directionicon.trim();
    }
}