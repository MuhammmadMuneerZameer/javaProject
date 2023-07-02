/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abcedriancount;

import java.util.Arrays;
import java.lang.Iterable;

/**
 *
 * @author zmune
 */
public class Abcedriancount {

    public static void main(String[] args) {
        String data = "abdest, Abba, amz, Anna, Dada, purple, Deed, Toto, sees, biopsy, deflux, dimpsy, reappear, Mimi, behint, none";
        String[] words = data.split(",\\s");
        int count = 0;
        int DBLNcount = 0;
        
        
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
            
            for (int j = 0; j < words[i].length() - 1; j++) {
                if (words[i].charAt(j + 1) <= words[i].charAt(j)) {
                    
                    count++;
                    break; // Exit the loop if any out-of-order character is found
                }
            }
             for (int j = 0; j < words[i].length() - 1; j++) {
                if (words[i].charAt(j + 1) == words[i].charAt(j)) {
                    
                    DBLNcount++;
                    break; // Exit the loop if any out-of-order character is found
                }
            }
        }
        
        System.out.println("Number of abecedarian words: " + ( words.length-count));
        System.out.println("Number of doubleloon words: " + ( DBLNcount));
        System.out.println(Arrays.toString(words));
    }
    
    }
