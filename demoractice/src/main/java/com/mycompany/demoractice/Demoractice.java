/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demoractice;

import java.util.Scanner;

/**
 *
 * @author zmune
 */
public class Demoractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name");
        String name = input.next();
        System.out.println("Enter the cutomer ID");
        int ID=input.nextInt();
        System.out.println("enter the units used");
        int Units= input.nextInt();
        double bills=0;

        if(Units<200){
            bills = 1.20*Units;
            System.out.println("this is your units for this month"+Units);
            System.out.println("this is your bill for this month"+bills);
        }
        if(Units<200){
            bills = 1.20*Units;
            bills = bills*1.15;
            System.out.println("this is your units for this month"+Units);
            System.out.println("this is your bill for this month"+bills);
        }
        if(Units<=200 && Units<400){
            bills = 1.50*Units;
            bills = bills*1.15;
            System.out.println("this is your units for this month"+Units);
            System.out.println("this is your bill for this month"+bills);
        }
        if(Units<=400 && Units<600){
            bills = 1.80*Units;
            bills = bills*1.15;
            System.out.println("this is your units for this month"+Units);
            System.out.println("this is your bill for this month"+bills);
        }
        if(Units>=600){
            bills = 2.0*Units;
            bills = bills*1.15;
            System.out.println("this is your units for this month"+Units);
            System.out.println("this is your bill for this month"+bills);
        }
        
        
    }
}
