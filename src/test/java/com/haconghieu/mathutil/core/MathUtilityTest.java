/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.haconghieu.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HA CONG HIEU
 */
public class MathUtilityTest {
    
    // Cau truc testcase: ID | desc | Step | Expected Result | Status
    //test case 1: Verify getFactorial(with n = 0)
        //Test Procedures/Steps:
        //          Given: n = 0
        //          Invoke getFactorial(n = 0)
        //Expected Result: 1;
    // Status: PASS | FAILED doan xem, cho code xong, chay moi biet duoc
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0) );
    }
    //Test case 2: ... 
    
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(1) );
    }
    //test case 3: ..
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOk(){
        assertEquals(120, MathUtility.getFactorial(5) );
    }
    
}
