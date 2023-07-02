/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaintro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author zmune
 */
public class Javaintro {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        while(true){
//            System.out.println("enter username:");
//            String user= sc.next();
//            System.out.println("enter password:");
//            String password= sc.next();
//            if("admin".equals(user) && "123456".equals(password)){
//                System.out.println("logged in successfully");
//                break;
//            }
//            
//        }


//        System.out.println("input number 1");
//        int n1 = sc.nextInt();
//        System.out.println("input number 2");
//        int n2 = sc.nextInt();
//        int even=0;
//        int odd=0;
//        
//      while(n1<n2){
//          if(n1%2==0){
//              even++;
//              
//          }
//          if(n1%2!=0){
//              odd++;
//          }
//          n1++;
//      }
//      System.out.println("total number of even"+even);
//      System.out.println("total number of odd"+odd);
//      
      

//        finding Armstrong number
//        int count =0;
//        for(int num =100;num<=500;num++){
//            String[] number=Integer.toString(num).split("");
//            int x=Integer.parseInt(number[0]);
//            int y=Integer.parseInt(number[1]);
//            int z=Integer.parseInt(number[2]);
//            double totalSum = Math.pow(x,3)+Math.pow(y,3)+Math.pow(z,3);
//            int sum= (int)Math.round(totalSum);
//            if(sum==num){
//                System.out.println(num);
//            }
//            
//            
//        }
//    }



//               Factorial number
//          System.out.println("enter number");
//          int num =sc.nextInt();
//          int factorial=num;
//          for(int i=1;i<num;i++){
//              factorial=factorial*i;
//          }
//          System.out.println(factorial);
//          
   


//          ap progression
String choice;

//        do {
//            System.out.print("Enter the first term: ");
//            int firstTerm = sc.nextInt();
//
//            System.out.print("Enter the common difference: ");
//            int commonDifference = sc.nextInt();
//
//            System.out.print("Enter the value of n: ");
//            int n = sc.nextInt();
//
//            int nthTerm = firstTerm + (n - 1) * commonDifference;
//            System.out.println("The " + n + "th term of the sequence is: " + nthTerm);
//
//            System.out.print("Do you want to continue (yes/no)? ");
//            choice = sc.next();
//        } while (choice.equalsIgnoreCase("yes"));
//
//        sc.close();


//        multipication number 
        
//         System.out.println("enter the number ");
//         int n = sc.nextInt();
//         for (int i=1;i<=10;i++){
//             System.out.println(n+" x "+i+"="+(n*i) );
//         }
   

//  number divisible by 3 and 5
//      for(int i=1;i<=60;i++){
//          if(i%3==0 && i%5==0){
//              System.out.println(i);
//          }



//         2d arrays
         

//         System.out.printf("enter the matrix size");
//         int n=sc.nextInt();
//         int x=sc.nextInt();
//        int[][] matrix=new int[n][x];
//        for(int i=0;i<n;i++){
//            System.out.println("enter the next"+i+" line");
//            for(int j=0;j<x;j++){
//                System.out.printf("enter the"+j);
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//
////        int[][] matrix={{1,2,4},{4,5,6},{7,8,9}};
//        int sum1= matrix[0][0]+matrix[1][1]+matrix[2][2];
//        int sum2= matrix[0][2] +matrix[1][1]+matrix[2][0];
//        int d=0;
//        if(sum2>sum1){
//            d=sum2 - sum1;
//            
//        }
//        else if(sum1>sum2){
//            d=sum1 - sum2;
//            
//        }
//        System.out.println(sum1+" "+sum2);
//        System.out.println(d);
//        



//       multiply matrix 3x3 3x4
//int[][] matrix1 = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//        };
//
//        // Define the second matrix (3x4)
//        int[][] matrix2 = {
//            {1, 2, 3, 4},
//            {5, 6, 7, 8},
//            {9, 10, 11, 12}
//        };

//         int[][] matrix1= new int[3][3];
//         int[][] matrix2= new int[3][4];
//         System.out.println("enter data of matrix1 3x3");
//         for(int i=0;i<matrix1.length;i++){
//             for(int j=0 ;j<matrix1[i].length;j++){
//                 System.out.print("enter data");
//                matrix1[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("enter data of matrix2 3x4");
//            for (int i =0;i<matrix2.length;i++) {
//                for (int j = 0; j < matrix2[i].length; j++) {
//                    System.out.print("enter data");
//                    matrix2[i][j]=sc.nextInt();
//                    
//                }
//            }
//             int[][] Tmatrix =new int[matrix1.length][matrix2[0].length];
//       for(int i=0;i<matrix1.length;i++){
//           for(int j=0;j<matrix2[0].length;j++){
//               for(int k=0;k<matrix2.length;k++){
//                   Tmatrix[i][j]+=matrix1[i][k]*matrix2[k][j];
//               }
//               
//               
////               for(int k=0;k<)
//           }
//                   
//       }
//       System.out.println("Resulting Matrix:");
//        for (int i = 0; i < Tmatrix.length; i++) {
//            for (int j = 0; j < Tmatrix[0].length; j++) {
//                System.out.printf(Tmatrix[i][j]+" ");
//            }
//            System.out.println();
//            
//        }




//           find the least number NOT available

         System.out.println("Enter the array ");
         String a =sc.nextLine();
         int[] arr= Integer.parseInt(a.split(" "));
         System.out.println(solution(arr));
         
         while(true){
             int i=1;
             String va=Integer.toString(i);
           if(a.contains(va)){
           i++;
           }
           else{
               
               System.out.println(i);
               break;
           }
             
           
         }
         
//HashSet<Integer> set = new HashSet<>();
//        System.out.println(set);
         
//         for(int i=0;i<arr.length;i++){
//            
//         }
    }
}
