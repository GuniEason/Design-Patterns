package com.p6.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.strategy
 * @className PayStrategy
 * @author: zhuyf
 * @Date:2022/12/07 09:53
 * @Description: //
 */
public class PayStrategy {

    public final static String ALI_PAY = "AliPay";
    public final static String DEFAULT_PAY = ALI_PAY;
    public final static String WECHAT_PAY = "WechatPay";
    public final static String UNION_PAY = "UnionPay";
    private static final Map<String, Payment> PAYMENT_MAP = new HashMap<>(3);

    static {
        PAYMENT_MAP.put(ALI_PAY, new AliPay());
        PAYMENT_MAP.put(WECHAT_PAY, new WechatPay());
        PAYMENT_MAP.put(UNION_PAY, new UnionPay());
    }

    public static Payment get(String payKey) {
        if (!PAYMENT_MAP.containsKey(payKey)) {
            return PAYMENT_MAP.get(DEFAULT_PAY);
        }
        return PAYMENT_MAP.get(payKey);
    }

}
