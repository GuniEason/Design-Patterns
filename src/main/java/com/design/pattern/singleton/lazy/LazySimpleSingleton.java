package com.design.pattern.singleton.lazy;

/**
 * 懒汉式单例：在外部调用时才创建实例
 * 优点：节约了内存
 * 缺点：在多线程环境下易被破坏单例 （加锁后线程安全，但影响效率）
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySingleton;


    private LazySimpleSingleton() {
    }

    public static synchronized LazySimpleSingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySimpleSingleton();
        }
        return lazySingleton;
    }

}
