package com.design.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.command
 * @className Contr
 * @author: zhuyf
 * @Date:2022/12/07 16:00
 * @Description: //
 */
public class Controller {

    private List<IAction> actionList = new ArrayList<>();

    public void addAction(IAction action) {
        actionList.add(action);
    }

    public void execute(IAction action) {
        action.execute();
    }

    public void excutes() {
        for (IAction iAction : actionList) {
            iAction.execute();
        }
        actionList.clear();
    }
}
