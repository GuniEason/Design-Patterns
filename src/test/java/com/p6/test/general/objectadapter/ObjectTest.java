package com.p6.test.general.objectadapter;

import com.p6.pattern.general.objectadapter.AC220;
import com.p6.pattern.general.objectadapter.PowerAdapter;

/**
 * @project Design-Patterns
 * @package com.p6.test.general.objectadapter
 * @className ObjectTest
 * @author: zhuyf
 * @Date:2022/11/28 11:48
 * @Description: //
 */
public class ObjectTest {

    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
