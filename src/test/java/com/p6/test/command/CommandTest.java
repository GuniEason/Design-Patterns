package com.p6.test.command;

import com.p6.pattern.command.Controller;
import com.p6.pattern.command.GPlayer;
import com.p6.pattern.command.actions.PlayAction;
import com.p6.pattern.command.actions.SpeedAction;
import com.p6.pattern.command.actions.StopAction;

/**
 * @project Design-Patterns
 * @package com.p6.test.command
 * @className CommandTest
 * @author: zhuyf
 * @Date:2022/12/07 16:03
 * @Description: //
 */
public class CommandTest {

    public static void main(String[] args) {

        GPlayer player = new GPlayer();
        Controller controller = new Controller();
        controller.execute(new PlayAction(player));

        System.out.println("==========执行命令宏==========");
        controller.addAction(new PlayAction(player));
        controller.addAction(new StopAction(player));
        controller.addAction(new SpeedAction(player));
        controller.excutes();

    }
}
