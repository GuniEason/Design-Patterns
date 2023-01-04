package com.design.test.decorator;

import com.design.pattern.decorator.batterCake.BatterCake;
import com.design.pattern.decorator.batterCake.BatterCakeDecorator;
import com.design.pattern.decorator.batterCake.EggDecorator;
import com.design.pattern.decorator.batterCake.PancakeImpl;
import com.design.pattern.decorator.loger.JsonLogger;
import com.design.pattern.decorator.loger.JsonLoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoratorTest {
    private static final JsonLogger logger = JsonLoggerFactory.getLogger(DecoratorTest.class);

    private static final Logger log = LoggerFactory.getLogger(DecoratorTest.class);


    public static void main(String[] args) {
//        BatterCake cake = new BatterCakeImpl();
//
//        cake = new BatterCakeDecorator(cake);
//
//        cake = new EggDecorator(cake);
//
//        cake = new EggDecorator(cake);
//
//        System.out.println(cake.getMsg() +",总价"+ cake.getPrice());

        BatterCake cake = new PancakeImpl();

        cake = new BatterCakeDecorator(cake);

        cake = new EggDecorator(cake);

        cake = new EggDecorator(cake);

        System.out.println(cake.getMsg() +",总价"+ cake.getPrice());


//        Weapon weapon;
//
//        weapon = new BaseWeapon("屠龙刀",10,2,-1);
//
//        System.out.println(weapon.getWeaponName()+"基础属性="+"，攻击力:"+weapon.getDamage()
//                +"，敏捷："+weapon.getAgile()+"，智力:"+weapon.getIntellect());
//
//        weapon = new WeaponDecorator(weapon);
//
//        weapon = new RubyDecorator(weapon);
//
//        weapon = new EmeraldDecorator(weapon);
//
//        weapon = new SapphireDecorator(weapon);
//
//        logger.info(weapon.getWeaponName()+"，攻击力:"+weapon.getDamage()
//                +"，敏捷："+weapon.getAgile()+"，智力:"+weapon.getIntellect());

//        UserNavigationBar bar ;
//        bar = new BaseUserBarDecorator(new User("张三","会员",new ArrayList<>()));
//        bar = new QABar(bar);
//        bar = new EssayBar(bar);
//        bar = new HomeWorkBar(bar);
//        bar.getUserBar().getBarList().stream().collect(Collectors.groupingBy(Navigation::getBarName));
//        logger.info(bar);

    }
}
