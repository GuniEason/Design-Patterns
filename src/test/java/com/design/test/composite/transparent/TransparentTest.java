package com.design.test.composite.transparent;

import com.design.pattern.composite.transparent.Course;
import com.design.pattern.composite.transparent.CoursePackage;


/**
 * @project Design-Patterns
 * @package com.p6.test.composite.transparent
 * @className TransparentTest
 * @author: zhuyf
 * @Date:2022/11/27 14:12
 * @Description: // 透明模式：在最顶层的抽象类中定义所有行为，
 * 不管是树枝节点还是叶子节点都对所有行为有访问权，违背了迪米特原则
 */
public class TransparentTest {

    public static void main(String[] args) {
        Course course = new Course("J2EE", 7000);
        Course ai = new Course("人工智能", 8000);
        Course designPattern = new Course("设计模式", 5000);
        Course sourceCode = new Course("源码学习", 5000);
        CoursePackage coursePackage = new CoursePackage("Java架构师课程", 2);
        coursePackage.addChild(designPattern);
        coursePackage.addChild(sourceCode);

        //叶子节点也能调用addChild方法，不符合迪米特原则
//        ai.addChild(sourceCode);
        CoursePackage aiPackage = new CoursePackage("AI包", 2);
        aiPackage.addChild(course);
        aiPackage.addChild(ai);

        CoursePackage catLog = new CoursePackage("学习目录", 1);
        catLog.addChild(aiPackage);
        catLog.addChild(coursePackage);

        catLog.print();

    }


}
