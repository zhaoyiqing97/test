package com.zhao.www.thread;

public class TestThread1 extends Thread {
    /**
     * 创建方式一,继承Thread类
     */
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码---"+i);
        }
    }
    public static void main(String[] args) {
        //创建线程对象
        TestThread1 testThread1 = new TestThread1();
        //开启线程
        testThread1.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程---"+i);
        }
    }
}
