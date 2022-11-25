package com.p6.test.prototype;

import com.p6.pattern.prototype.ConCreatePrototype;
import com.p6.pattern.prototype.Prototype;

import java.util.Arrays;

/**
 * @project Design-Patterns
 * @package com.p6.test.prototype
 * @className PrototypeTest
 * @author: zhuyf
 * @Date:2022/11/25 09:14
 * @Description: //
 */
public class PrototypeTest {

    public static void main(String[] args) {

        ConCreatePrototype concreatePrototype = new ConCreatePrototype();
        concreatePrototype.setAge(18);
        concreatePrototype.setName("Eason");
        concreatePrototype.setHobbies(Arrays.asList("张三","李四"));

        Client client = new Client();
        ConCreatePrototype copy = (ConCreatePrototype) client.startClone(concreatePrototype);

//        ConCreatePrototype copy = (ConcreatePrototype) concreatePrototype.clone();

        System.out.println(copy);
        System.out.println(concreatePrototype);
        System.out.println("克隆对象中引用类型地址的值："+copy.getHobbies());
        System.out.println("愿对象中引用类型地址的值："+concreatePrototype.getHobbies());
        System.out.println("对象地址比较："+(copy.getHobbies() == concreatePrototype.getHobbies()));//引用类型的值一致 浅克隆

    }
}

class Client{

    public  Prototype startClone(Prototype conCreatePrototype){
        return conCreatePrototype.clone();
    }
}
