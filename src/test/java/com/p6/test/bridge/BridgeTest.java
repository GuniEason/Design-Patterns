package com.p6.test.bridge;

import com.p6.pattern.bridge.AbstractMessage;
import com.p6.pattern.bridge.IMessage;
import com.p6.pattern.bridge.NormalMessage;
import com.p6.pattern.bridge.QQMessage;
import com.p6.pattern.bridge.SmsMessage;
import com.p6.pattern.bridge.UrgencyMessage;

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
