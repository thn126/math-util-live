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
public class MathUtil {

    //n! = 1.2.3.4.5.6....n
    //0!= 1!= 1
    //Kh tinh giai thua am
    //20! la vua khop kieu long, kieu long 18 so 0
    //21! lo kieu long
    //Neu dua vao am hay la 21! t deo tinh va ta dap vao mat ai xai ham nay
    // 1 cai exception, chui thay me no
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument! n must be between 0 .. 20");
            //ham dung lun kh can return;
        }
        //xuong day la n tu 0 den 20
        if (n == 0 || n == 1) {
            return 1;
        }
        //xuong day, n=2,...20.
        //choi for hoac recursion
        //ki thuat nhoi con heo dat, oc bu nhoi thit
        // i=2, i=3, i=4, i=n nhoi lien tuc i vo tich
        long product= 1;
        for (int i = 2; i <= n; i++) {
            product *=i;
        }// nhan tu 2 den n
        
        
        return product;
    }
}
