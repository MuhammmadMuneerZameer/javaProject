/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author zmune
 */
public class Mavenproject1 {

    public static void main(String[] args) {
//          Scanner in=new Scanner(System.in);
//           String formatted ="";
//        String[] s = new String[3];
//        s[0]= sc.nextLine();
//        s[1]= sc.nextLine();
//        s[2]= sc.nextLine();
//        
//        System.out.println("================================");
//        for(int i=0;i<s.length;i++){
//            String[] part= s[i].split(" ");
//            for(int j=0;j<=10-part[0].length();j++){
//                formatted=formatted+" ";
//            }
//            
//            if( Integer.parseInt(part[1])<100){
////              formattedNumber = String.format("%02d", part[1]);
////              System.out.println(formattedNumber);
//                part[1]="0"+part[1];
//            } 
//            System.out.printf(part[0]);
//            System.out.println(formatted+ part[1]);
//            formatted="";
//        }
//        System.out.println("================================");
//        
//          Scanner in = new Scanner(System.in);
         Scanner in = new Scanner(System.in);
        String sent;
        String[] part;
        int a, b, n;

        while (true) {
            sent = in.nextLine();
            part = sent.split(" ");

            if (part.length < 3) {
                continue;
            }

            a = Integer.parseInt(part[0]);
            b = Integer.parseInt(part[1]);
            n = Integer.parseInt(part[2]);
            int s = 0;

            for (int i = 0; i < n; i++) {
                s = (int) (a + (Math.pow(2, i) * b));
                a = s;
                System.out.print(" " + s);
            }

            System.out.println();
        }

        
    }
            
}

