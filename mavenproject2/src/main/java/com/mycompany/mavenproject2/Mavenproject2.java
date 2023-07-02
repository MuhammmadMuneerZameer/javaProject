/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author zmune
 */
public class Mavenproject2 {

    public static void main(String[] args) {
//          Scanner input = new Scanner(System.in);
//          System.out.print("Enter the day: ");
//        int d = input.nextInt();
//        System.out.print("Enter the month: ");
//        int m = input.nextInt();
//        System.out.print("Enter the year: ");
//        int y = input.nextInt();
//        int yo =(y-(14-m)/12);
//        int x =(yo + yo/4 - yo/100 + yo/400 );
//        int mo = ( m + 12 *((14-m)/12)-2 );
//        int Do = ((d+x +(31* mo)/12 )%7);
//        System.out.println("the date will be " + Do+"/"+mo+"/"+yo); 
//         input.close();
     Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int neg=0;
      int pos=0;
      int zero =0;
      int[] arr1= new int[n];
      for (int i=0;i<n;i++){
          
           arr1[i]= sc.nextInt();
           if(arr1[i]<0){
               neg++;
              
           }
           if(arr1[i]>0){
               pos++;
               
           }
           if(arr1[i]==0){
               zero++;
               
              
           }
           
           
          
      }
      
      DecimalFormat df = new DecimalFormat("0.000000");
      double posratio= (double) pos/n;
      double negratio= (double) neg/n;
      double zeroratio= (double) zero/n;
      
      System.out.println(df.format(posratio));
      System.out.println(df.format(negratio));
      System.out.println(df.format(zeroratio));
   
    }
}
