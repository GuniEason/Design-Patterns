package com.p6.pattern.builder;

import com.p6.pattern.service.entity.Eason;

/**
 * 简单建造模式
 */
public class SimpleBuilder {

    private Eason eason = new Eason();


    public void setName(String name){
        eason.setName(name);
    }

    public void setAge(Integer age){
        eason.setAge(age);
    }

    public void setHeight(Double height){
        eason.setHeight(height);
    }

    public void setWeight(Double weight){
        eason.setWeight(weight);
    }

    public Eason build(){
        return eason;
    }

}
