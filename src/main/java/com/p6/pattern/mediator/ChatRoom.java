package com.p6.pattern.mediator;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.mediator
 * @className ChatRoom
 * @author: zhuyf
 * @Date:2022/12/08 13:12
 * @Description: //
 */
public class ChatRoom {
    public void showMsg(User user, String message) {
        System.out.println("[" + user.getNaem() + "]:" + message);
    }
}
