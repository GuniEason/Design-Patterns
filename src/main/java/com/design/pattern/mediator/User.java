package com.design.pattern.mediator;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.mediator
 * @className User
 * @author: zhuyf
 * @Date:2022/12/08 13:13
 * @Description: //
 */
public class User {

    private String naem;

    private ChatRoom chatRoom;

    public User(String naem, ChatRoom chatRoom) {
        this.naem = naem;
        this.chatRoom = chatRoom;
    }

    public String getNaem() {
        return naem;
    }

    public void sendMsg(String content) {
        this.chatRoom.showMsg(this, content);
    }
}
