package com.p6.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例：容器式单例，将对象放置容器中 使用唯一表示获取实例
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String,Object> ioc = new ConcurrentHashMap<>(16);

    public static Object getInstance(String className){
        if (ioc.containsKey(className)) {
            return ioc.get(className);
        }
        try {
            Object instance = Class.forName(className).newInstance();
            ioc.put(className,instance);
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
