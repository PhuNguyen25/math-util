/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nguyendangphu.mathutil;



/**
 *
 * @author pro
 */
public class MathUtilyti {
    public static final double PI = 3.1415;

//   public static long getFactorial(int n) {
//        // hàm tính n! = 1.2.3.4.5
//        // quy ước: 0! = 1! = 1;
//        // long = 10^18
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid argument. N must be between 0 -  20");
//        }
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        long sum = 1;
//        for (int i = 1; i < n + 1; i++) {
//            sum *= i;
//        }
//        return sum;
//    }
public static long getFactorial(int n) {
        // hàm tính n! = 1.2.3.4.5
        // quy ước: 0! = 1! = 1;
        // long = 10^18
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. N must be between 0 -  20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        // minh thừa biết n! = (n - 1)!
        return n * getFactorial(n-1);
    }

    

}
