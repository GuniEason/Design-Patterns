package com.p6.pattern.singleton.lazy;

/**
 * 懒汉式静态内部类：利用java本身的语法特点，在被调用时创建实例（原理，java中静态内部类知道被调用时才会被加载）
 * 优点： 代码优雅，节约内存，效率高，不能被反射破坏单例
 * 缺点：在构造方法里抛异常，不优雅
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){
        if (null != singletonHolder.INNER_CLASS_SINGLETON) {
            throw new RuntimeException("不允许非法访问");
        }

    }

    public static LazyStaticInnerClassSingleton getInstance(){
        return  singletonHolder.INNER_CLASS_SINGLETON;
    }

    /**
     * 创建静态内部类
     */
    private static class singletonHolder{
        private static final LazyStaticInnerClassSingleton INNER_CLASS_SINGLETON = new LazyStaticInnerClassSingleton();
    }

}
