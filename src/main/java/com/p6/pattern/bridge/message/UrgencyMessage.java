package com.p6.pattern.bridge.message;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.bridge.message
 * @className NomalMessage
 * @author: zhuyf
 * @Date:2022/11/28 13:29
 * @Description: //
 */
public class UrgencyMessage extends AbstractMessage {

    public UrgencyMessage(IMessage message) {
        super(message);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "【加急】" + message;
        super.sendMessage(message, toUser);
    }


}
