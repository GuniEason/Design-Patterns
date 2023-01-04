package com.design.pattern.bridge;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.bridge.message
 * @className NomalMessage
 * @author: zhuyf
 * @Date:2022/11/28 13:29
 * @Description: //
 */
public class NormalMessage extends AbstractMessage {

    public NormalMessage(IMessage message) {
        super(message);
    }
}
