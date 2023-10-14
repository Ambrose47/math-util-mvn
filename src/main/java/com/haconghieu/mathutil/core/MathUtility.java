/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.haconghieu.mathutil.core;

/**
 *
 * @author HA CONG HIEU
 */

// đây là bộ thư viện chứa các hàm dùng trong toán học dùng trong tính toán
// clone giống class Math bên JDK
// khi gọi là thư viện dùng chung mà không cần nhớ nhung j sau khi xủa lý -> thư viện chứa đồ STATIC
public class MathUtility {
    public static final double PI = 3.1415;
    //hàm tính n! = 1.2.3....n
    //n<0 n>20 không tính do 21! tràn kiểu long
    // 0! =1! =1
//    public static long getFactorial(int n){
//        long result = 1;
//        
//        if(n < 0|| n>20){
//            throw new IllegalArgumentException("Invalid");           
//        }
//        if(n == 0 || n == 1){
//            return 1;
//        }
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    //  NÂNG CẤP HÀM TÍNH GIAI THỪA DÙNG THUẬT TOÁN ĐỆ QUY 
    // ĐỆ QUY LÀ GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN (ĐỆ QUY -RECURSION)
        public static long getFactorial(int n){
        
        if(n < 0|| n>20){
            throw new IllegalArgumentException("Invalid");           
        }
        if(n == 0 || n == 1){
            return 1;
        }
        return n * getFactorial(n-1);
    }
        
// KĨ THUẬT ĐÃ XANH, TEST LẠI ĐỂ VẪN XANH, MÀ KHÔNG CẦN NHÌN CHI TIẾT CON
// NGƯỜI TA GỌI LÀ : REGRESSTION TEST - TEST HỒI QUY
}
