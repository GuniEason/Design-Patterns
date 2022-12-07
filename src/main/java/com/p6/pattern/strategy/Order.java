package com.p6.pattern.strategy;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.strategy
 * @className Order
 * @author: zhuyf
 * @Date:2022/12/07 10:02
 * @Description: //
 */
public class Order {

    private String uid;
    private Double price;

    public Order(String uid, Double price) {
        this.uid = uid;
        this.price = price;
    }

    public MsgResult pay() {
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为" + price + "开始扣款");
        return payment.pay(uid, price);
    }

}
