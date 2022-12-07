package com.p6.pattern.state;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.state
 * @className UnLoginState
 * @author: zhuyf
 * @Date:2022/12/07 18:06
 * @Description: //
 */
public class UnLoginState extends UserState {
    @Override
    public void favorite() {
        this.switchLogin();
        this.context.getState().favorite();
    }

    private void switchLogin() {
        System.out.println("跳转到登录页面");
        this.context.setState(AppContext.STATE_LOGIN);
    }

    @Override
    public void comment(String comment) {
        this.switchLogin();
        this.context.getState().comment(comment);
    }
}
