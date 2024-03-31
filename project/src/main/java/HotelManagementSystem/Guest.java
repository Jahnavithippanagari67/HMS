package HotelManagementSystem;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author janu
 */
public class Guest {
   int id; 
   String name; 
   String email;
   int discount;
   
  public Guest(int id,String name,String email,int discount){
      this.id=id;
      this.name=name;
      this.email=email;
      this.discount=discount;
  }
  public Guest(){}
  public int getId(){
      return id;
  }
  public String getName(){
    return name;
  }
 public String getEmail(){
   return email;
}
public int getDiscount(){
     return discount;
} public void setId(int id){
      this.id=id;
}
public void setName(String name){
       this.name=name;
}
public void setEmail(String email){
        this.email=email;
}
public void setDiscount(int discount){
         this.discount=discount;
}

public void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}