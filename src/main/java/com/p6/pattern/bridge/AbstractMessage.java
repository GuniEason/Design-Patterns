package com.p6.pattern.bridge;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.bridge.message
 * @className AbastractMessage
 * @author: zhuyf
 * @Date:2022/11/28 13:30
 * @Description: //
 */
public abstract class AbstractMessage {

    private IMessage message;

    public AbstractMessage(IMessage message) {
        this.message = message;
    }


    public void sendMessage(String message, String toUser) {
        this.message.send(message, toUser);
    }

}
