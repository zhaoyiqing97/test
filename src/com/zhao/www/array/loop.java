package com.zhao.www.array;

public class loop {
    public static void main(String[] args) {
        /**
         * 打印三角形 5行
         */
        for (int j = 1; j <= 5; j++) {
            for (int i = 5; i >= j; i--) {
                System.out.print(" ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            for (int i = 1; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}