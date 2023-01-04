package com.design.test.iterator;

import com.design.pattern.iterator.CourseAggregateImpl;
import com.design.pattern.iterator.Iterator;
import com.design.pattern.iterator.IteratorAggregate;
import com.design.pattern.service.entity.CourseEntity;

import java.util.Arrays;

/**
 * @project Design-Patterns
 * @package com.p6.test.iterator
 * @className IteratorTest
 * @author: zhuyf
 * @Date:2022/12/07 13:46
 * @Description: //
 */
public class IteratorTest {

    public static void main(String[] args) {
        Arrays.asList(
                new CourseEntity("JAVA架构", 400),
                new CourseEntity("JAVA基础", 500),
                new CourseEntity("设计模式", 600),
                new CourseEntity("人工智能", 700)
        );

        CourseEntity java = new CourseEntity("JAVA架构", 400);
        CourseEntity ee = new CourseEntity("JAVA基础", 500);
        CourseEntity design = new CourseEntity("设计模式", 600);
        CourseEntity ai = new CourseEntity("人工智能", 700);

        IteratorAggregate aggregate = new CourseAggregateImpl();
        aggregate.add(java);
        aggregate.add(ee);
        aggregate.add(design);
        aggregate.add(ai);

        System.out.println("+++++++++++++课程列表+++++++++++++");
        printCourseEntity(aggregate);
        aggregate.remove(ai);
        System.out.println("+++++++++++++删除后课程列表+++++++++++++");
        printCourseEntity(aggregate);

    }

    private static void printCourseEntity(IteratorAggregate aggregate) {
        Iterator<CourseEntity> i = aggregate.iterator();
        while (i.hasNext()) {
            CourseEntity course = i.next();
            System.out.println("《" + course.getName() + "》");
        }

    }
}
