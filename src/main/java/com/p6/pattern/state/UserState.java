package com.p6.pattern.state;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.state
 * @className UserState
 * @author: zhuyf
 * @Date:2022/12/07 18:04
 * @Description: //
 */
public abstract class UserState {

    protected AppContext context;

    public void setAppContext(AppContext appContext) {
        this.context = appContext;
    }

    public abstract void favorite();

    public abstract void comment(String comment);
}
