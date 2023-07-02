/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.umaima;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author zmune
 */
public class Umaima {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int listsize = sc.nextInt();
     
     String[] list= new String[listsize];
     for(int i=0;i<listsize;i++){
         list[i]=sc.next();    
     }
     int quersize = sc.nextInt();
     int[] rarr= new int[quersize];
     String[] querie= new String[quersize];
     for(int i=0;i<quersize;i++){
         querie[i]=sc.next();
     }
     for(int i=0;i<quersize;i++){
         int count=0;
         for(int j=0;j<listsize;j++){
             if(querie[i].equals(list[j])){
                 count++;
             }
             rarr[i]=count;
             
         }System.out.println(rarr[i]);
     }
     
    }
}
