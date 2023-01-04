package com.design.pattern.chain;

import org.apache.commons.lang.StringUtils;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.chain
 * @className ValidateHandler
 * @author: zhuyf
 * @Date:2022/12/07 13:01
 * @Description: //
 */
public class ValidateHandler extends Handler {
    @Override
    public void doHandler(Member member) {
        if (StringUtils.isEmpty(member.getLoginName()) || StringUtils.isEmpty(member.getLoginPass())) {
            System.out.println("账号或密码为空");
            return;
        }
        if (null != next) {
            next.doHandler(member);
        }
    }
}
