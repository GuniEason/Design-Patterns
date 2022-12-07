package com.p6.pattern.chain;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.chain
 * @className MemberService
 * @author: zhuyf
 * @Date:2022/12/07 13:09
 * @Description: //
 */
public class MemberService {

    public void login(String loginName, String loginPass) {
        Member member = new Member(loginName, loginPass, null);

        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());

        builder.build().doHandler(member);
    }
}
