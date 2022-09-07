package com.p6.pattern.singleton.lazy;

/**
 * 双重检查懒汉式单例：在外部调用时才创建实例，在调用时和创建时检查是否需要创建实例
 * 优点：在线程安全的情况下优化创建效率
 * 缺点：可读性差，代码不优雅
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazySingleton;


    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance(){
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }

}
