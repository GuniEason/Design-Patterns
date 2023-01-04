package com.design.pattern.faced;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.facaed
 * @className QualifyService
 * @author: zhuyf
 * @Date:2022/11/26 09:10
 * @Description: //
 */
public class QualifyService {

    public boolean isAvailable(GiftInfo giftInfo){
        System.out.println("校验"+giftInfo.getName()+"积分通过");
        return true;
    }
}
