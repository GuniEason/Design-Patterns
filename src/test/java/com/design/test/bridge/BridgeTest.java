package com.design.test.bridge;

import com.design.pattern.bridge.AbstractMessage;
import com.design.pattern.bridge.IMessage;
import com.design.pattern.bridge.NormalMessage;
import com.design.pattern.bridge.QQMessage;
import com.design.pattern.bridge.SmsMessage;
import com.design.pattern.bridge.UrgencyMessage;

/**
 * @project Design-Patterns
 * @package com.p6.test.bridge.message
 * @className BridgeTest
 * @author: zhuyf
 * @Date:2022/11/28 13:34
 * @Description: //
 */
public class BridgeTest {

    public static void main(String[] args) {
        IMessage message = new SmsMessage();
        AbstractMessage abstractMessage = new NormalMessage(message);
        abstractMessage.sendMessage("SMS消息发送内容", "Eason");

        message = new QQMessage();
        abstractMessage = new UrgencyMessage(message);
        abstractMessage.sendMessage("本月工资暂缓发放！", "Eason");
    }
}
