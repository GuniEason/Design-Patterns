package com.design.pattern.decorator.batterCake;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.decorator.batterCake
 * @className Pancake
 * @author: zhuyf
 * @Date:2022/11/26 09:47
 * @Description: //
 */
public class PancakeImpl extends BatterCake {
    @Override
    public String getMsg() {
        return "手抓饼";
    }

    @Override
    public int getPrice() {
        return 7;
    }
}
