package com.design.pattern.singleton.threadLocal;

/**
 * ThreadLocal单例模式
 *
 *   原理：以线程为key来保存实例
 * 数据源切换单例
 */
public class ThreadLocalSingleton {

    private static  final  ThreadLocal<ThreadLocalSingleton> threadLocaLInstance
            = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton() {
    }

    public static  ThreadLocalSingleton getInstance(){
        return threadLocaLInstance.get();
    }
}
