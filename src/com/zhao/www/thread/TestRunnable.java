package com.zhao.www.thread;

public class TestRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程启动"+i);
        }
    }

    public static void main(String[] args) {
        TestRunnable testRunnable = new TestRunnable();
        new Thread(testRunnable).start();
        for (int i = 0; i < 20; i++) {
            System.out.println("主线程启动"+i);
        }
    }
}
