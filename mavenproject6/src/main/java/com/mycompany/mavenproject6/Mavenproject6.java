/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author zmune
 */
public class Mavenproject6 {

    public static void main(String[] args) {
         Scanner sc= new Scanner (System.in);
       int n=sc.nextInt();
       
       int[] number=new int[n];
       int [] count=new int[n];
       for(int i=0;i<n;i++){
           number[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n-i;j++){
               int no =0;
               if(number[i]==number[j]){ 
                   no++;
                   count[i]=no;
                   System.out.println("this is i"+number[i]+" this is j"+number[j]);
               }
               
           }
           
       }
       System.out.println(Arrays.toString(count));
       System.out.println(Arrays.toString(number));
       for(int i=0;i<n;i++){
              if(count[i]==0){
                  System.out.println("The unique element "+number[i]);
              } 
    }
}}
