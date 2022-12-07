package com.p6.pattern.composite.transparent;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.composite.transparent
 * @className Course
 * @author: zhuyf
 * @Date:2022/11/27 12:52
 * @Description: //
 */

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course extends  BaseCourseComponent{

    private String name;

    private double price;

    @Override
    public String getName(BaseCourseComponent component) {
        return this.name;
    }

    @Override
    public double getPrice(BaseCourseComponent component) {
        return this.price;
    }


    @Override
    public void print() {
        System.out.println("课程"+name +"的价格为:"+price);
    }
}
