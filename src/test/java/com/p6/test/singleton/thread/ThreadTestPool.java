package com.p6.test.singleton.thread;

import com.p6.pattern.singleton.threadLocal.ThreadLocalSingleton;

public class ThreadTestPool implements Runnable{


    @Override
    public void run() {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
    }
}
