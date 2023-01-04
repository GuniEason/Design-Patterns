package com.design.pattern.state;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.state
 * @className AppContext
 * @author: zhuyf
 * @Date:2022/12/07 18:05
 * @Description: //
 */
public class AppContext {

    public static final UserState STATE_LOGIN = new LonginState();
    public static final UserState UN_STATE_LOGIN = new UnLoginState();
    private UserState currentState = UN_STATE_LOGIN;


    {
        STATE_LOGIN.setAppContext(this);
        UN_STATE_LOGIN.setAppContext(this);
    }

    public UserState getState() {
        return this.currentState;
    }

    public void setState(UserState state) {
        this.currentState = state;
    }


    public void favorite() {
        this.currentState.favorite();
    }

    public void comment(String comment) {
        this.currentState.comment(comment);
    }
}
