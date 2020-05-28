package hotelproject;
 
import java.util.ArrayList;
import java.util.Scanner;
public class Suits extends places{
    static Scanner input=new Scanner(System.in);
        coustmer SingleSuit []=new coustmer[6];
            coustmer doubleSuit []=new coustmer[6];
            private int roomNum; 

             
 public    void descprition(){
     
        System.out.println("choose waether you want single bed or double bed: ");
        String type=input.next();
        setRate(type);
       System.out.println(""); 
        
 }
 public   void setRate(String type){
 
if (type.equals("single")){
    if(singleRoomStatus( SingleSuit)){
    rate = 1500.00;
    System.out.println("your reservation is confirmoed");
      System.out.println("enter your information: first name , last name ,date of birth , Email , phone number");
           String first = input.next();
           String last = input.next();
           int day = input.nextInt();
           int month = input.nextInt();
           int year = input.nextInt();
           Date birth = new Date(day,month,year);
           String email = input.next();
           String phone = input.next();
      SingleSuit[roomNum]=new coustmer(first,last,birth,email,phone);
    System.out.println("the price is "+rate);}
 
}

  {
if(type.equals("double")){
    
 if( doubleRoomStatus( doubleSuit)){
rate = 1650.00;
    System.out.println("your reservation is confirmoed");
      System.out.println("enter your information: first name , last name ,date of birth , Email , phone number");
           String first = input.next();
           String last = input.next();
           int day = input.nextInt();
           int month = input.nextInt();
           int year = input.nextInt();
           Date birth = new Date(day,month,year);
           String email = input.next();
           String phone = input.next();
      SingleSuit[roomNum]=new coustmer(first,last,birth,email,phone);
    System.out.println("the price is "+rate);}
 }}}
 
        public  boolean singleRoomStatus(coustmer singleSuit[]){
       System.out.println("enter your suit number");
       int number = input.nextInt();
       if(singleSuit[number].equals(null)){
           System.out.println("the suit is Available ");
           return true ;}
       else{ System.out.println("the suit is not available");
           return false ;
       }
   
   } 
     public  boolean doubleRoomStatus(coustmer doubleSuit[]){
       System.out.println("enter your suit number");
       int number = input.nextInt();
       if(doubleSuit[number].equals(null)){
           System.out.println("the suit is Available ");
           return true ;}
       else{ System.out.println("the suit is not available");
           return false ;
       }
   
   } 
   
}
