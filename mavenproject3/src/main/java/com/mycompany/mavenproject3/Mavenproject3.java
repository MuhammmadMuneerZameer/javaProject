/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;
import java.util.Scanner;
/**
 *
 * @author zmune
 */
public class Mavenproject3 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
          System.out.print("Enter the initial amount: ");
          double p = input.nextDouble();
          System.out.print("Enter the rate of interest per year: ");
          double r = input.nextDouble();
          System.out.print("Enter the time in years: ");
          double t = input.nextDouble();
          double finalAmount=  (p*2.78*Math.exp(r*t));
          
           System.out.println("the final amount will be " + finalAmount); 
         input.close();
          

        
    }
}
