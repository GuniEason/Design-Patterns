package com.p6.pattern.singleton.lazy;

/**
 * 双重检查懒汉式单例：在外部调用时才创建实例，在调用时和创建时检查是否需要创建实例
 * 优点：在线程安全的情况下优化创建效率
 * 缺点：可读性差，代码不优雅
 */
public class LazyDoubleCheckSingleton {

    //加 volatile 关键字解决重排序问题
    private volatile static LazyDoubleCheckSingleton lazySingleton;


    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance(){
        //检查是否要阻塞
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class){
                //检查是否要重新创建实例
                if (lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();
                    //指令重排序的问题
                }
            }
        }
        return lazySingleton;
    }

}
