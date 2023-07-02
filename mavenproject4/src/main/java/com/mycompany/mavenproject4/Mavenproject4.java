/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author zmune
 */
public class Mavenproject4 {

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] part =s.split(" ");
        long sum=0,sum1=0;
        int[] arr= new int[5];
        
     for(int i=0;i<part.length;i++){
         arr[i]=Integer.parseInt(part[i]); 
         
     }Arrays.sort(arr);
     for(int i=1;i<arr.length;i++){
         sum=sum + arr[i];
     }
     for(int i=0;i<arr.length-1;i++){
         sum1=sum1 + arr[i];
     }
     System.out.print(Arrays.toString(arr));
     System.out.print(sum1+" ");
     System.out.print(sum);
    }
}
