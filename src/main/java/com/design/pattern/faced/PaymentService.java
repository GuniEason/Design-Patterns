package com.design.pattern.faced;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.facaed
 * @className PaymentService
 * @author: zhuyf
 * @Date:2022/11/26 09:08
 * @Description: //
 */
public class PaymentService {

    public boolean pay(GiftInfo giftInfo){
        System.out.println("支付"+giftInfo.getName()+"成功，扣除积分：8888");
        return true;
    }
}
