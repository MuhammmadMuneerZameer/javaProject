/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject9;

/**
 *
 * @author zmune
 */
public class Person {
      public int age;
      public Person(int InitialAge){
           if(0<InitialAge){
            age=InitialAge;
            System.out.println("data saved succesfully");
        }
         if(0>InitialAge){
            age=0;
            System.out.println("the data is negative age is set to zero");
        }
      }
      
       public void YearPasses(){
        if(age<13){
        System.out.println("you are young");
    }
//    }
}
}
