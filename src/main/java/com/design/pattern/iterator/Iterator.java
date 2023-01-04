package com.design.pattern.iterator;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.Iterator
 * @className Iterator
 * @author: zhuyf
 * @Date:2022/12/07 13:38
 * @Description: //
 */
public interface Iterator<E> {

    E next();

    boolean hasNext();
}
