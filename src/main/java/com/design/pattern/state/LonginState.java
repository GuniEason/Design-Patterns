package com.design.pattern.state;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.state
 * @className LonginState
 * @author: zhuyf
 * @Date:2022/12/07 18:06
 * @Description: //
 */
public class LonginState extends UserState {
    @Override
    public void favorite() {

        System.out.println("收藏成功");
    }

    @Override
    public void comment(String comment) {
        System.out.println(comment);

    }
}
