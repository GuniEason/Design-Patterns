package com.design.pattern.bridge;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.bridge.message
 * @className EmailMessage
 * @author: zhuyf
 * @Date:2022/11/28 13:25
 * @Description: //
 */
public class EmailMessage implements IMessage {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用Email发送消息：" + message + "  至" + toUser);
    }
}
