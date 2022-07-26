/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Collections;

/**
 *
 * @author CONG
 */
public class Test3 {

    public Test3() {
    }
    
    public void F3 (String F3){
        String arr[] = F3.split("\\s+");
        
        for (int i = 0; i < arr.length - 1; i++) {
              for (int j = i; j < arr.length; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0)
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        
    }
}
