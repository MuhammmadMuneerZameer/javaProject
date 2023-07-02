/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Iterable;

/**
 *
 * @author zmune
 */
public class Mavenproject7 {

    public static void main(String[] args) throws IOException{
//       Scanner sc = new Scanner (System.in);
//       int num=sc.nextInt();
//       String[] arr = new String[num];
//       for( int n=0;n<num;n++){
//           System.out.println(n);
//       }
//   }
//    public static int lonelyinteger(String[] a) {
//    return 0;
//    }
//    int f1=20;
//    int f2=30;
//    String location ="C:\\Users\\zmune\\OneDrive\\Desktop\\java\\";
//    File f = new File(location+"table.txt");
//    try
//    {
//        for(int i=f1;i<f2;i++){
//            FileWriter fw =new FileWriter(f,true);
//            fw.write(tableline(i)+"\r\n");
//            fw.close();
//            
//        }
//    }
//    catch(IOException ex){
//        ex.printStackTrace();
//        
//    }
//    
String newlocation ="C:\\Users\\zmune\\OneDrive\\Desktop\\java\\";
File fw=new File (newlocation+"word.txt");
try{
    FileReader fr = new FileReader(fw);
    int character=0;
    String data="";
    while((character=fr.read())!=1){
        
    }
    
}
catch(IOException e){
    e.printStackTrace();
}
    }
    public static String tableline(int number){
        String tableline="";
        for(int i=1; i<=11;i++){
            tableline +=(i*number+ "\t");
        }
        return tableline;
    }
}
