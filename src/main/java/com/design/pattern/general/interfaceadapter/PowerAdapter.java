package com.design.pattern.general.interfaceadapter;

import com.design.pattern.general.objectadapter.AC220;

/**
 * @project Design-Patterns
 * @package com.p6.pattern.general.classadapter
 * @className PowerAdapter
 * @author: zhuyf
 * @Date:2022/11/28 11:41
 * @Description: //可定制接口适配，但违背单一职责原则
 */
public class PowerAdapter implements DC {

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

    @Override
    public int output12V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 18;
        System.out.println("进入适配器,输入电压::" + adapterInput + "V,输出电压:" + adapterOutput + "V");
        return adapterOutput;
    }

    @Override
    public int output24V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 9;
        System.out.println("进入适配器,输入电压::" + adapterInput + "V,输出电压:" + adapterOutput + "V");
        return adapterOutput;
    }

    @Override
    public int output36V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 6;
        System.out.println("进入适配器,输入电压::" + adapterInput + "V,输出电压:" + adapterOutput + "V");
        return adapterOutput;
    }
}
