package com.blankj.study.singleton;

// 饿汉单例 线程安全
public class HungrySingleton {
    private HungrySingleton() {
    }

    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
