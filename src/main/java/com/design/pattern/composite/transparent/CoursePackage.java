package com.design.pattern.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.composite.transparent
 * @className CoursePackage
 * @author: zhuyf
 * @Date:2022/11/27 12:51
 * @Description: //
 */
public class CoursePackage extends BaseCourseComponent {

    private List<BaseCourseComponent> items = new ArrayList<>();

    private String name;

    private Integer level;

    public CoursePackage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void addChild(BaseCourseComponent component) {
        items.add(component);
    }

    @Override
    public void removeChild(BaseCourseComponent component) {
        items.remove(component);
    }

    @Override
    public String getName(BaseCourseComponent component) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("课程包" + this.name);

        for (BaseCourseComponent item : items) {

            if (this.level != null) {
                for (int i = 0; i < this.level; i++) {
                    System.out.print("  ");
                }
                for (int i = 0; i < this.level; i++) {
                    if (i == 0) {
                        System.out.print("+");
                    }
                    System.out.print("-");
                }
            }
            item.print();
        }
    }
}

