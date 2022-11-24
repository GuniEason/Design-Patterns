package com.p6.test.builder;

import com.p6.pattern.builder.SimpleBuilder;
import com.p6.pattern.builder.chain.ChainBuilder;
import com.p6.pattern.service.entity.Eason;


public class BuilderTest {

    public static void main(String[] args) {
        SimpleBuilder builder = new SimpleBuilder();
        builder.setName("Eason");
        builder.setAge(29);
        builder.setHeight(180.3);
        builder.setWeight(165.2);
        Eason build = builder.build();
        System.out.println(build);


        System.out.println("#################################");
        System.out.println(new ChainBuilder()
                .setWeight(160.1)
                .setAge(18)
                .setName("Eason")
                .setHeight(185.2)
                .build());
    }
}
