/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author Thien's
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("excpected: 5! = 120; actual: "+MathUtil.getFactorial(5));
        System.out.println("excpected: 6! = 720; actual: "+MathUtil.getFactorial(6));
        System.out.println("excpected: 0! = 1; actual: "+MathUtil.getFactorial(0));
        
        //MathUtil.getFactorial(-5); nem exception
        
        //Them code sau lan dau tien lm chuyen ay -code len server 11:20 AM 22/9/2022
        System.out.println("excpected: 1! = 1; actual: "+MathUtil.getFactorial(1));
        System.out.println("excpected: 3! = 6; actual: "+MathUtil.getFactorial(3));
    }
    
}
