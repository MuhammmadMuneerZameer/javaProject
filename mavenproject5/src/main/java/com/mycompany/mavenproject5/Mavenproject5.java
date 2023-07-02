/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject5;

import java.util.Scanner;

/**
 *
 * @author zmune
 */
public class Mavenproject5 {
     public static String removeLastTwoCharacters(String inputString) {
        if (inputString.length() < 2) {
            // Handle cases where the string has less than two characters
            return "";
        } else {
            return inputString.substring(0, inputString.length() - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
    String Time= sc.next();
    if(Time.startsWith("12") && Time.contains("AM") ){
        String modifiedString = removeLastTwoCharacters(Time);
        String[] part= modifiedString.split(":");
        String ntime= part[0].replace("12", "00");
        System.out.println(ntime+":"+part[1]+":"+part[2]);
        
    }
    else if(Time.contains("PM") && Time.startsWith("12")){
        String modifiedString = removeLastTwoCharacters(Time);
        System.out.println(modifiedString);
    }
    else if(Time.contains("AM")){
      String modifiedString = removeLastTwoCharacters(Time);
      System.out.println(modifiedString);  
    }
    else if(Time.contains("PM")){

    String modifiedString = removeLastTwoCharacters(Time);
        String[] part= modifiedString.split(":");
        int ntime= Integer.parseInt(part[0])+12;
        System.out.println(ntime+":"+part[1]+":"+part[2]);
    
    }
    

    }
}
