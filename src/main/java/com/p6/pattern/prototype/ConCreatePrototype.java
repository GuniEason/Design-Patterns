package com.p6.pattern.prototype;

import java.util.List;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.prototype
 * @className ConcreatePrototype
 * @author: zhuyf
 * @Date:2022/11/25 09:12
 * @Description: //
 */
public class ConCreatePrototype implements Prototype{

    private  int age;

    private String name;

    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConCreatePrototype concreatePrototype = new ConCreatePrototype();
        concreatePrototype.setAge(this.age);
        concreatePrototype.setName(this.name);
        concreatePrototype.setHobbies(this.hobbies);
        return concreatePrototype;
    }
}
