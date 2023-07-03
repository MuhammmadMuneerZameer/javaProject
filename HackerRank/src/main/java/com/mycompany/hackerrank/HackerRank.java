/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author zmune
 */
public class HackerRank {
 public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       int num=sc.nextInt();
       int[] narr= new int[num];
       for(int i=0;i<num;i++){
           narr[i]=sc.nextInt();
       }
       System.out.println(lonelyinteger(narr));
 }
   
    public static int lonelyinteger(int[] nums) {
          int result = 0;
        for (int num : nums) {
            result ^= num;  // Using bitwise XOR to find non-repeated number
        }
        return result;}
    
}

