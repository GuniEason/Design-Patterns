package com.design.pattern.strategy;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.strategy
 * @className AliPay
 * @author: zhuyf
 * @Date:2022/12/07 09:48
 * @Description: //
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联";
    }

    @Override
    public Double queryBalance(String uid) {
        return 200D;
    }

}
