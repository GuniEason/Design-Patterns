package com.p6.pattern.faced;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.facaed
 * @className FacaedService
 * @author: zhuyf
 * @Date:2022/11/26 09:16
 * @Description: //
 */
public class FacedService {

    QualifyService qualifyService = new QualifyService();

    PaymentService paymentService = new PaymentService();

    ShippingService shippingService = new ShippingService();

    public void buyGift(GiftInfo giftInfo){
        if (qualifyService.isAvailable(giftInfo)){
            if (paymentService.pay(giftInfo)){
                String shippingNum = shippingService.getShippingNum(giftInfo);
                System.out.println("下单成功,物流单号为："+shippingNum);
            }
        }

    }
}
