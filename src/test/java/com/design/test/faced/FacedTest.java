package com.design.test.faced;

import com.design.pattern.faced.FacedService;
import com.design.pattern.faced.GiftInfo;

/**
 * @project Design-Patterns
 * @package com.p6.test
 * @className facaed
 * @author: zhuyf
 * @Date:2022/11/26 09:18
 * @Description: //
 */
public class FacedTest {

    public static void main(String[] args) {
        GiftInfo giftInfo = new GiftInfo("PS5");

        FacedService facedService = new FacedService();
        facedService.buyGift(giftInfo);

    }
}
