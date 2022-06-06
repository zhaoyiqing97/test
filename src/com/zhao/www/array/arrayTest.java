package com.zhao.www.array;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class arrayTest {
    public static void main(String[] args) {
       int[]  arrays= {1,2,3,4,5};
       int[] revserse = resverse(arrays);
       printArray(revserse);
//       revserse(arrays);
    }
    //打印数组元素
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
    //反转数组
    public static int[] resverse(int[] arrays) {
        //反转的操作
        int[] result = new int[arrays.length];
        for (int i = 0,j = result.length-1; i < arrays.length; i++,j--) {
            result[j]= arrays[i];
        }
        return result;
    }
}
