package com.design.pattern.bridge;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.bridge.message
 * @className SmsMessage
 * @author: zhuyf
 * @Date:2022/11/28 13:26
 * @Description: //
 */
public class SmsMessage implements IMessage {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用Sms发送消息：" + message + "  至" + toUser);
    }
}
