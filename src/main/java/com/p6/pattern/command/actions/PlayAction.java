package com.p6.pattern.command.actions;

import com.p6.pattern.command.GPlayer;
import com.p6.pattern.command.IAction;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.order.actions
 * @className PlayAction
 * @author: zhuyf
 * @Date:2022/12/07 15:48
 * @Description: //
 */
public class PlayAction implements IAction {
    private GPlayer gplayer;

    public PlayAction(GPlayer gplayer) {
        this.gplayer = gplayer;
    }

    @Override
    public void execute() {
        gplayer.play();
    }
}
