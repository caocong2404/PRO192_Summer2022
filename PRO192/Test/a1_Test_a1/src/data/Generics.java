/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.List;

/**
 *
 * @author CONG
 */
public class Generics<T>{
  public static<T>int count(List<T>list,T element){
    int cnt=0;
    for(T e:list)
       if(e.equals(element))
         ++ cnt;
    return cnt;
  }
}
