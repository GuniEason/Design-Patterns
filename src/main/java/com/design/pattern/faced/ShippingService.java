package com.design.pattern.faced;

import java.util.UUID;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.facaed
 * @className ShippingService
 * @author: zhuyf
 * @Date:2022/11/26 09:11
 * @Description: //
 */
public class ShippingService {

    public String getShippingNum(GiftInfo giftInfo){
        System.out.println("获取"+giftInfo.getName()+"物流单号成功");
        return giftInfo.getName()+UUID.randomUUID();
    }
}
