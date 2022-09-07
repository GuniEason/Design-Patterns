package com.p6.test.singleton;

import com.p6.pattern.singleton.threadLocal.ThreadLocalSingleton;
import com.p6.test.singleton.thread.ThreadTestPool;

public class ThreadLocalTest {

    public static void main(String[] args) {
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread s1 = new Thread(new ThreadTestPool());
        Thread s2 = new Thread(new ThreadTestPool());
        s1.start();
        s2.start();
        System.out.println("end");

    }
}
