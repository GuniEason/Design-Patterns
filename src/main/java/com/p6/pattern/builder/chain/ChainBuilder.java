package com.p6.pattern.builder.chain;

import com.p6.pattern.service.entity.Eason;

/**
 * 链式建造模式
 */
public class ChainBuilder {

    private Eason eason = new Eason();


    public ChainBuilder setName(String name){
        eason.setName(name);
        return this;
    }

    public ChainBuilder setAge(Integer age){
        eason.setAge(age);
        return this;
    }

    public ChainBuilder setHeight(Double height){
        eason.setHeight(height);
        return this;
    }

    public ChainBuilder setWeight(Double weight){
        eason.setWeight(weight);
        return this;
    }

    public Eason build(){
        return eason;
    }
}
