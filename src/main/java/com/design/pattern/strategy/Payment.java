package com.design.pattern.strategy;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.strategy
 * @className Payment
 * @author: zhuyf
 * @Date:2022/12/07 09:47
 * @Description: //
 */
public abstract class Payment {

    public abstract String getName();


    //通用逻辑放到抽象类里面实现
    public MsgResult pay(String uid, Double amount) {
        Double balance = queryBalance(uid);
        if (balance < amount) {
            return new MsgResult(500, "支付失败", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额" + amount + ",余额为：" + (balance - amount));
    }

    public abstract Double queryBalance(String uid);

}
