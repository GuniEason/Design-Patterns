package com.p6.pattern.singleton.threadLocal;

/**
 * ThreadLocal单例模式
 *
 *
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
