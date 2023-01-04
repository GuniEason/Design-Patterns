package com.design.test.singleton.thread;

import com.design.pattern.singleton.threadLocal.ThreadLocalSingleton;

public class ThreadTestPool implements Runnable{


    @Override
    public void run() {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
    }
}
