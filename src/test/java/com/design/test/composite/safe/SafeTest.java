package com.design.test.composite.safe;

import com.design.pattern.composite.safe.File;
import com.design.pattern.composite.safe.Folder;

/**
 * @project Design-Patterns
 * @package com.p6.test.composite.safe
 * @className SafeTest
 * @author: zhuyf
 * @Date:2022/11/27 15:04
 * @Description: //安全写法：在顶层抽象类中只定义共性行为，叶子节点不具备所有行为的访问权
 */
public class SafeTest {

    public static void main(String[] args) {
        System.out.println("安全模式启动");

        File idea = new File("IDEA");
        File datagrip = new File("Datagrip");
        File excel = new File("Excel");
        Folder office = new Folder("办公软件", 2);
        office.addFile(idea)
                .addFile(datagrip)
                .addFile(excel);
        File lol = new File("LOL");
        File cs = new File("CSGo");
        Folder game = new Folder("娱乐", 2);
        game.addFile(lol).addFile(cs);

        File weChat = new File("weChat");
        File qq = new File("QQ");
        File ding = new File("Ding Talk");
        Folder social = new Folder("社交软件", 2);
        social.addFile(weChat).addFile(qq).addFile(ding);

        Folder folder = new Folder("Eason", 1);
        folder.addFile(office).addFile(game).addFile(social);
        folder.show();


    }
}
