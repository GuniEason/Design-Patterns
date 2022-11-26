package com.p6.test;

import com.p6.pattern.faced.FacedService;
import com.p6.pattern.faced.GiftInfo;

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
