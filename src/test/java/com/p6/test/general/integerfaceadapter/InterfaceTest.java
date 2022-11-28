package com.p6.test.general.integerfaceadapter;

import com.p6.pattern.general.interfaceadapter.PowerAdapter;
import com.p6.pattern.general.objectadapter.AC220;

/**
 * @project Design-Patterns
 * @package com.p6.test.general.integerfaceadapter
 * @className InterfaceTest
 * @author: zhuyf
 * @Date:2022/11/28 11:55
 * @Description: //
 */
public class InterfaceTest {

    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        powerAdapter.output5V();
        powerAdapter.output12V();
        powerAdapter.output24V();
        powerAdapter.output36V();
    }
}
