/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author CONG
 */
public class Test2 {

    public Test2() {
    }

    public void F2(String F2) {

        String arr[] = F2.split("\\s+");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
