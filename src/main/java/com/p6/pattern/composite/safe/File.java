package com.p6.pattern.composite.safe;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.composite.safe
 * @className File
 * @author: zhuyf
 * @Date:2022/11/27 15:02
 * @Description: //
 */
public class File extends Directory {

    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
