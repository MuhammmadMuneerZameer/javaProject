/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortarray;

import java.util.Arrays;

/**
 *
 * @author zmune
 */
public class Sortarray {

    public static void main(String[] args) {
          int[] x={32,11,23,14,55,78,24};
          for(int i=0;i<x.length-1;i++){
              for(int y=0;y<x.length-1;y++){
                  
                  if(x[y]>=x[y+1]){
                      int temp=x[y];
                      x[y]=x[y+1];
                      x[y+1]=temp;
                  }
                 
                 
                  
                  
              }
          }System.out.println("this is sorted array"+Arrays.toString(x));
    }
}
