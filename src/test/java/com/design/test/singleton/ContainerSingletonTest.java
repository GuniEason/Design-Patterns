package com.design.test.singleton;

import com.design.pattern.singleton.register.ContainerSingleton;

/**
 * @project Design-Patterns
 * @package com.p6.test.singleton
 * @className COntainerSingletonTest
 * @author: zhuyf
 * @Date:2022/11/24 08:31
 * @Description: //
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {
        Object instance1 = ContainerSingleton.getInstance("com.p6.pattern.singleton.register.ContainerSingleton");
        Object instance = ContainerSingleton.getInstance("com.p6.pattern.singleton.hungry.HungryStaticSingleton");
        System.out.println(instance);
        System.out.println(instance1);
    }
}
