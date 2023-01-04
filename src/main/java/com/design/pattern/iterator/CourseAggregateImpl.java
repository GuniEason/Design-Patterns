package com.design.pattern.iterator;

import com.design.pattern.service.entity.CourseEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.iterator
 * @className CourseAggregateImpl
 * @author: zhuyf
 * @Date:2022/12/07 13:42
 * @Description: //
 */
public class CourseAggregateImpl implements IteratorAggregate {

    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public Iterator<CourseEntity> iterator() {
        return new IteratorImpl<>(courseList);
    }

    @Override
    public void add(CourseEntity course) {
        courseList.add(course);
    }

    @Override
    public void remove(CourseEntity course) {
        courseList.remove(course);
    }
}
