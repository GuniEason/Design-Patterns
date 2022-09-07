package com.p6.test.singleton;

import com.p6.pattern.singleton.lazy.LazyDoubleCheckSingleton;

import java.lang.reflect.Constructor;

public class ReflectTest {

    /**
     * 反射破坏单例
     * @param args
     */
    public static void main(String[] args) {

        try {
            Class<LazyDoubleCheckSingleton> clazz = LazyDoubleCheckSingleton.class;
            Constructor<LazyDoubleCheckSingleton> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            System.out.println(constructor.newInstance());

            //反射破坏懒汉式静态内部类
//        Class<?> clazz = LazyStaticInnerClassSingleton.class;
//            Constructor<?> constructor = clazz.getDeclaredConstructor(null);
//            constructor.setAccessible(true);
//            System.out.println(constructor.newInstance());
//            System.out.println(constructor.newInstance());

            //反射破坏懒汉式
//            Class<LazySimpleSingleton> lazySimpleSingletonClass = LazySimpleSingleton.class;
//            Constructor<LazySimpleSingleton> constructor = lazySimpleSingletonClass.getDeclaredConstructor(null);
//            constructor.setAccessible(true);
//            System.out.println(constructor.newInstance());

            //反射无法破坏枚举式单例
//            Class<EnumSingleton> clazz = EnumSingleton.class;
//            Constructor<EnumSingleton> constructor = clazz.getDeclaredConstructor(String.class,int.class);
//            constructor.setAccessible(true);
//            System.out.println(constructor.newInstance());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
