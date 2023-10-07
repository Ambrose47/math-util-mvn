/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.haconghieu.mathutil.main;

import com.haconghieu.mathutil.core.MathUtility;

/**
 *
 * @author HA CONG HIEU
 */
public class Main {
    
    public static void main(String[] args) {
        // test thu ham vua code co dung khong
        //cb bi bo data test, test case
        //test case 1: check if getFactorial run well with n = 0
        //Test Procedures/Steps:
        //          Given: n = 0
        //          Invoke getFactorial(n = 0)
        //Expected Result: 1; //0! == 1???
        long expected = 1;//em hy vong duoc tra ve
        int n = 0; // neu anh dua vao 0!
        long actual = MathUtility.getFactorial(n); // chay ham moi biet
        //in ra va tu ket luan co giong ky vong hay khong
        System.out.println(n + "! | expected = " + expected + " | actual = " +actual);
        
        //Test Case 2: check if getFactorial run well with n = 1
        //Test Procedures/Steps:
        //          Given: n = 1
        //          Invoke getFactorial(n = 1)
        //Expected Result: 1; //1! == 1???
        System.out.println("1! | expected = " + expected + " | actual = " +MathUtility.getFactorial(1));
    }
}
