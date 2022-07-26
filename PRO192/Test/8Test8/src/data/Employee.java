/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

public class Employee implements Comparable<Employee>{
  String ID;String name;int salary;
                                   
  public Employee(String ID,String name,int salary){
    this.ID=ID;this.name=name;this.salary=salary;
  }
  @Override
  public String toString(){
    return ID+","+name+","+salary;
  }
  
  @Override
  public int compareTo(Employee obj){
    return this.ID.compareTo(obj.ID);
    }
}
