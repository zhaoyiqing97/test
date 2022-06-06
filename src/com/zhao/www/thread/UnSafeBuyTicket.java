package com.zhao.www.thread;

/**
 * 不安全的买票
 */
public class UnSafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket,"小明").start();
        new Thread(buyTicket,"小红").start();
        new Thread(buyTicket,"黄牛").start();

    }

}
class BuyTicket implements Runnable{
    private int ticketNums = 10;
    boolean flag = true;
    @Override
    public void run() {
        //买票
        while(flag){
            buy();
        }
    }
    public void buy(){
        if(ticketNums<=0){
            flag = false;
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
    }
}
