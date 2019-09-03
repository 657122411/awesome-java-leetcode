package com.blankj.study.singleton;


// 懒汉单例 线程安全
public class LazySingleton {
    private LazySingleton() {
    }

    ;

    private static volatile LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null)
                    instance = new LazySingleton();
            }
        }
        return instance;
    }
}
