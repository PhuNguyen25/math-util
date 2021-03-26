/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nguyendangphu.mathutil.main;
import com.nguyendangphu.mathutil.MathUtilyti;
/**
 *
 * @author pro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int n = 0;
        long expected = 120;
        long actual = MathUtilyti.getFactorial(n);

//        System.out.println("Hello Github!");
//        System.out.println("This ís 1st upload that connects"
//                + "to remote server: github");
        System.out.println("5! expected:" + expected + "; actual " + actual);
        
        n =0;
        expected =1;
        actual = MathUtilyti.getFactorial(n);
         System.out.println("0! expected:" + expected + "; actual " + actual);
        

    }

    // Trong Quy trình làm PM, dân DEV phải có trách nhiệm test từng hàm
    // từng class mà mình viết ra trước khi đóng gói gửi cho bên qa/qc test
    // độc lập, từng làm từng classs phải được test cẩn thận trước khi chúng 
    // vừa hoàn thiện chưa thèm bàn về ui thì mức độ test sớm này gọi là unit test level - test từng đơn thể, đơn vị code
    // Cách test từng hàm từng class
    // 1 Dùng sout(gọi hàm từng test()) để in giá trị trả về
    // 2 Dùng JOptionPane để pop up một cửa sổ in ra kết quả
    // 3 Dùng LOG FILE trang web in ra kết quả xử lí của hàm
    // => gọi là ACTUAL VALUE
    // giá trị ta mong muốn trả về == EXPECTED VALUE
    // nếu ACTUAL VALUE == EXPECTED VALUE > hàm chạy ngon
    // nguyên tắc: so sánh ACTUAL VULUE  với EXPECTED VALUE

}
