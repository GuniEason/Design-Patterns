package com.p6.test.chain;

import com.p6.pattern.chain.MemberService;

/**
 * @project Design-Patterns
 * @package com.p6.test.chain
 * @className ChainTest
 * @author: zhuyf
 * @Date:2022/12/07 13:14
 * @Description: //
 */
public class ChainTest {

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("admin", "123456");
    }
}
