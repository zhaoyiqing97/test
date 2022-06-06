package com.zhao.www.array;

public class Reverse {
    public static void main(String[] args) {
        String str = "i am a boy!";
        String arrayStr[] = str.split(" ");
        String newStr = "";
        for (int i = arrayStr.length-1; i >=0; i--) {
            newStr = newStr + arrayStr[i] +" ";
        }
        System.out.println(newStr);
    }
}
