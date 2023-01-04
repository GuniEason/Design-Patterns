package com.design.test.general.classadapter;

import com.design.pattern.general.classadapter.PowerAdapter;

/**
 * @project Design-Patterns
 * @package com.p6.test.general.classadapter
 * @className ClassAdapter
 * @author: zhuyf
 * @Date:2022/11/28 11:43
 * @Description: //适配器不仅能输出5V，而且还能输出220V ，违背迪米特原则
 */
public class ClassAdapter {

    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter();
        adapter.output5V();
    }
}
