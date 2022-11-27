package com.p6.pattern.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.composite.safe
 * @className Folder
 * @author: zhuyf
 * @Date:2022/11/27 14:53
 * @Description: //
 */
public class Folder extends Directory {

    private List<Directory> directoryList;

    private Integer level;

    public Folder(String name, int level) {
        super(name);
        this.level = level;
        this.directoryList = new ArrayList<>();
    }

    @Override
    public void show() {
        System.out.println(this.name);

        for (Directory item : directoryList) {

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
            item.show();
        }
    }

    public Folder addFile(Directory directory) {
        directoryList.add(directory);
        return this;
    }

}
