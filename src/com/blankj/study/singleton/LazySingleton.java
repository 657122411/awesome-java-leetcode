package com.blankj.study.singleton;


/** 懒汉单例 线程安全
 * @author Administrator
 */
public class LazySingleton {
    /**
     * 屏蔽外部构造实例的途径
     */
    private LazySingleton() {
    }

    /**
     * static修饰属于类的变量 volatile禁止指令重排 初始null懒加载机制
     */
    private static volatile LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (instance == null) {
            //加锁线程同步
            synchronized (LazySingleton.class) {
                //双重检验，可能有多个线程进入到这里待执行
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                System.out.println(lazySingleton);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton lazySingleton = LazySingleton.getInstance();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(lazySingleton);
            }
        }).start();
    }
}
