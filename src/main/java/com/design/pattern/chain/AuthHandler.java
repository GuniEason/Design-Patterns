package com.design.pattern.chain;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.chain
 * @className AuthHandler
 * @author: zhuyf
 * @Date:2022/12/07 13:00
 * @Description: //
 */
public class AuthHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if ("admin".equals(member.getRoleName())) {
            System.out.println("您不是管理员，没有操作权限");
            return;
        }
        System.out.println("允许操作");
    }
}
