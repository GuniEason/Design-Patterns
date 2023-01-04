package com.design.pattern.factory;

import com.design.pattern.service.ICourse;

/**
 * 简单工厂
 */
public class SimpleFactory {

    /**
     * 传入类返回实例
     * @param clazz
     * @return 实例
     */
    public static ICourse create(Class<? extends ICourse> clazz) throws  Exception{
        if (null == clazz) {
            throw new RuntimeException("未传入类");
        }
        return clazz.newInstance();
    }

}
