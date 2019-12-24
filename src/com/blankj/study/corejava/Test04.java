package com.blankj.study.corejava;

public class Test04 {
    public volatile static int i = 0;

    public static class AddThread extends Thread {
        @Override
        public void run() {
            for (i = 0; i < 1000000000; i++) ;
        }
    }

    static Acount instance = new Acount();
    static int a = 0;
    public static class Acount implements Runnable{
        @Override
        public void run(){
            for(int j = 0;j<100000000;j++){
                synchronized (instance){
                    a++;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AddThread addThread = new AddThread();
        long start = System.currentTimeMillis();
        addThread.start();
        //等待线程结束 归来 默认参数为0，无限等待其执行时间，否则指定有限时间等待
        addThread.join(1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();t2.start();
        t1.join();t2.join();
        System.out.println(a);


    }
}
