package com.blankj.study.singleton;


//静态内部类单例
public class InnerSingleton {
    private InnerSingleton() {
    }

    public static InnerSingleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final InnerSingleton instance = new InnerSingleton();
    }

}
