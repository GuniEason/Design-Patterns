package com.design.pattern.composite.safe;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.composite.safe
 * @className Direcotry
 * @author: zhuyf
 * @Date:2022/11/27 14:50
 * @Description: //
 */
public abstract class Directory {

    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    public abstract void show();
}
