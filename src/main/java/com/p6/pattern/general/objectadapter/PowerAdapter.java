package com.p6.pattern.general.objectadapter;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.general.classadapter
 * @className PowerAdapter
 * @author: zhuyf
 * @Date:2022/11/28 11:41
 * @Description: //
 */
public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("进入适配器,输入电压::" + adapterInput + "V,输出电压:" + adapterOutput + "V");
        return adapterOutput;
    }
}
