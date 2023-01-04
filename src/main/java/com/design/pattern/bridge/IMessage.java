package com.design.pattern.bridge;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.bridge.message
 * @className Imessage
 * @author: zhuyf
 * @Date:2022/11/28 13:24
 * @Description: //
 */
public interface IMessage {

    void send(String message, String toUser);
}
