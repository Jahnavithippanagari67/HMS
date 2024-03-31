package HotelManagementSystem;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author janu
 */
public class Employee {
   int id;
String name;
double salary;
String job;
public Employee(int id,String name,double salary,String job){
   this.id=id;
   this.name=name;
   this.salary=salary;
   this.job=job;
}
public Employee(){}
public int getId(){
     return id;
}
public String getName(){
    return name;
}
public double getSalary(){
    return salary;
}
public String getJob(){
     return job;
}
public void setId(int id){
       this.id=id;
}
public void setName(String name){
     this.name=name;
}
public void setSalary(double salary){
      this.salary=salary;
} 
public void setJob(String job){
      this.job=job;
}
public void print(){
       System.out.println("id:"+id);
      System.out.println("name:"+name);
      System.out.println("salary:"+salary);
      System.out.println("job:"+job);
}
 
}
