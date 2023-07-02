/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject8;

import java.util.Scanner;

/**
 *
 * @author zmune
 */
public class Mavenproject8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
//        System.out.println("enter number1");
//        int a = sc.nextInt();
//        System.out.println("enter number2");
//        int b = sc.nextInt();
//        int c=a;
//        a=b;
//        b=c;
//        System.out.println("now the number1 is "+a+" and number 2 is "+b);
//        System.out.println("enter mass 1");
//        int m1= sc.nextInt();
//        System.out.println("enter mass 2");
//        int m2= sc.nextInt();
//        System.out.println("enter the radius");
//        int r= sc.nextInt();
//        System.out.println(force(m1, m2, r));
//        
//        
//        
//        
//    }
//    public static int force(int n1,int n2, int n3){
//        double G= 9.81;
//        double F= (G*n1*n2)/n3*n3;
//        return (int) F;
//          System.out.println("enter the x coordinate");
//          int x= sc.nextInt();
//          System.out.println("enter the y coordinate");
//          int y= sc.nextInt();
//          int x1=0;
//          int y1=0;
//          double d= Math.sqrt((x-x1)+(y-y1));
//          System.out.println("the distance from origin"+d);
//         System.out.println("enter the size in inches");
//         double in=sc.nextDouble();
//         double m=in*0.0254;
//          System.out.println(" the size metre is "+m+" metres");
//         
           System.out.println("enter the distance in metres");
           double distance= sc.nextDouble();
           sc.nextLine();
           System.out.println("enter the time");
           String timeset= sc.nextLine();
           String[] time = timeset.split(" ");
           int hours = Integer.parseInt(time[0]);
           int minutes = Integer.parseInt(time[1]);
           int second = Integer.parseInt(time[2]);
           int Thours=hours+(minutes/60)+(second/3600);
           int Tminutes=(hours*60)+minutes+(second/60);
           int Tsecond=(hours*3600)+(minutes*60)+second;
           double km=distance/1000;
           double miles=distance/1609;
           double ms= distance/Tsecond;
           double kmh= km/Thours;
           double mileh=miles/Thours;
           System.out.println("the speed in metre per second "+ms);
           System.out.println("the speed in kilometre per hour "+kmh);
           System.out.println("the speed in miles per hour "+mileh);
           
           


           
           
           
           
           
           
           
          
    }
    

}
