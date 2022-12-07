package com.p6.pattern.iterator;

import java.util.List;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.iterator
 * @className IteratorImpl
 * @author: zhuyf
 * @Date:2022/12/07 13:39
 * @Description: //
 */
public class IteratorImpl<E> implements Iterator<E> {

    private List<E> list;

    private int cursor;

    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.println("当前位置：" + this.cursor + "：");
        element = list.get(cursor);
        cursor++;
        return element;
    }

    @Override
    public boolean hasNext() {
        return !(cursor > (list.size() - 1));
    }
}
