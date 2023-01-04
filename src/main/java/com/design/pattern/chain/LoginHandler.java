package com.design.pattern.chain;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.chain
 * @className LoginHandler
 * @author: zhuyf
 * @Date:2022/12/07 12:57
 * @Description: //
 */
public class LoginHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        System.out.println("登陆成功");
        member.setRoleName("管理员");
        if (null != next) {
            next.doHandler(member);
        }
    }
}
