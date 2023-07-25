/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flippingbits;

import java.util.Scanner;

/**
 *
 * @author zmune
 */
public class Flippingbits {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String binary = "";
for(int j=0;j<q;j++){
    long n = sc.nextInt();
     for (int i = 31; i >= 0; i--) {
            int power = (int) Math.pow(2, i);
            if (n >= power) {
                binary = binary + "1";
                n = n - power;
            } else {
                binary = binary + "0";
            }
            
        }
        String complement= Flipped(binary);
        System.out.println(binary);
        binary="";
        System.out.println(binaryToDecimal(complement));
        System.out.println(complement);
    
}
       
    }
      
    public static String Flipped(String x){
        String NewBinary= "";
        for(int i=0; i<=x.length()-1;i++){
            char s = x.charAt(i);
            if(s=='0'){
                NewBinary=NewBinary+"1";
            }
            else if('1'==s){
                NewBinary=NewBinary+"0";
            }
//            System.out.println(s);
        }
        
        return NewBinary;
    }
    public static long binaryToDecimal(String x) {
    

    long decimal = 0;
    for (int i = 31; i >= 0; i--) {
        char bit = x.charAt(31 - i);
        if (bit == '1') {
            decimal += Math.pow(2,i); 
        } 
    }
    return decimal;
}







}
