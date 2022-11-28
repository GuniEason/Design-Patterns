package com.p6.pattern.general.classadapter;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.general.classadapter
 * @className PowerAdapter
 * @author: zhuyf
 * @Date:2022/11/28 11:41
 * @Description: //
 */
public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5V() {
        int adapterInput = super.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("进入适配器,输入电压::" + adapterInput + "V,输出电压:" + adapterOutput + "V");
        return adapterOutput;
    }
}
