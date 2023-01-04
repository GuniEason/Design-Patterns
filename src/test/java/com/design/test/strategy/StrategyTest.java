package com.design.test.strategy;

import com.design.pattern.strategy.Order;

import java.util.UUID;

/**
 * @project Design-Patterns
 * @package com.p6.test.strategy
 * @className StrategyTest
 * @author: zhuyf
 * @Date:2022/12/07 10:08
 * @Description: //
 */
public class StrategyTest {
    public static void main(String[] args) {
        Order order = new Order(UUID.randomUUID().toString(), 358.223D);
//        System.out.println(order.pay(PayStrategy.UNION_PAY));
        System.out.println(order.pay());
    }
}
