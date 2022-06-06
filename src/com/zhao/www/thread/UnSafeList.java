package com.zhao.www.thread;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 不安全的集合
 */
public class UnSafeList {
    public static void main(String[] args) throws InterruptedException {
        //jUC包里的方法
        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<String>();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }

        Thread.sleep(10);

        System.out.println("list's size = "+list.size());
    }
}