package com.p6.test.mediator;

import com.p6.pattern.mediator.ChatRoom;
import com.p6.pattern.mediator.User;

/**
 * @project Design-Patterns
 * @package com.p6.test.mediator
 * @className MediatorTest
 * @author: zhuyf
 * @Date:2022/12/08 13:15
 * @Description: //
 */
public class MediatorTest {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User zhangsan = new User("张三", chatRoom);
        User lisi = new User("李四", chatRoom);

        zhangsan.sendMsg("Hi,i'm zhangsan");
        lisi.sendMsg("Hi,i'm lisi");
    }
}
