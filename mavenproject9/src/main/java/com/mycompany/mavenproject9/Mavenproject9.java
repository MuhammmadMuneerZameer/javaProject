/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;

import java.util.Scanner;

/**
 *
 * @author zmune
 */
public class Mavenproject9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
//       System.out.println("enter the digits");
//       String digits=sc.next();
//       System.out.println("enter the num");
//       int num=sc.nextInt();
//        Mavenproject9 p1= new Mavenproject9(6);
          Person p1 = new Person(6);
        p1.YearPasses();
    }
    
//    public void YearPasses(){
//        If(age<13){
//        System.out.println("you are young");
//    }
//    }
    
    public int age;
    Mavenproject9(int Initalage){
        if(0<Initalage){
            age=Initalage;
            System.out.println("data saved succesfully");
        }
         if(0>Initalage){
            age=0;
            System.out.println("the data is negative age is set to zero");
        }
}

    private void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
