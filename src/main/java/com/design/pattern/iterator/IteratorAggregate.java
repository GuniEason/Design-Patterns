package com.design.pattern.iterator;

import com.design.pattern.service.entity.CourseEntity;


/**
 * @project Design-Patterns
 * @package com.p6.pattern.Iterator
 * @className Iterator
 * @author: zhuyf
 * @Date:2022/12/07 13:35
 * @Description: //
 */
public interface IteratorAggregate {

    Iterator<CourseEntity> iterator();

    void add(CourseEntity course);

    void remove(CourseEntity course);
}
