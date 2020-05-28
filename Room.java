package hotelproject;
 
import static hotelproject.Resrvation.input;
import java.util.Scanner;
 
public class Room extends places {
  static Scanner input=new Scanner(System.in);  
 private coustmer singleBed[]= new coustmer[6];
private int roomNum; 
private String type;
private boolean roomStatus;
 
private int numRoomsO =0;
private coustmer []doubleBed=new coustmer[6];
public Room(){
    
}//no argument constructor
 
public void setRate(String type){
if (type.equals("single")){
   if(singleRoomStatus( singleBed)){
    rate = 900.00;
       System.out.println("your reservation has been confirmed"+
               "\nyour room contains : 2 single bed and bathroom and 24\7 room service  , welcome to your room");
      System.out.println("enter your information: first name , last name ,date of birth , Email , phone number");
           String first = input.next();
           String last = input.next();
           int day = input.nextInt();
           int month = input.nextInt();
           int year = input.nextInt();
           Date birth = new Date(day,month,year);
           String email = input.next();
           String phone = input.next();
       singleBed[roomNum]=new coustmer(first,last,birth,email,phone);
    System.out.println("the price is "+rate);}
 
}
 
if(type.equals("double")){
   if(   doubleRoomStatus( doubleBed)){
rate = 1050.00;
  System.out.println("your reservation has been confirmed"+
               "\nyour room contains : 1 double bed and bathroom and 24\7 room service  , welcome to your room");
  
   System.out.println("enter your information: first name , last name ,date of birth , Email , phone number");
           String first = input.next();
           String last = input.next();
           int day = input.nextInt();
           int month = input.nextInt();
           int year = input.nextInt();
           Date birth = new Date(day,month,year);
           String email = input.next();
           String phone = input.next();
       doubleBed[roomNum]=new coustmer(first,last,birth,email,phone);
    System.out.println("the price is "+rate);}
}
} 
@Override
    public void descprition(){
        
        System.out.println("choose waether you want single bed or double bed: ");
        String type=input.next();
        setRate(type);
     
        
}
        public  boolean singleRoomStatus(coustmer singleBed[]){
       System.out.println("enter your room number");
       int number = input.nextInt();
       if(singleBed[number].equals(null)){
           System.out.println("the room is Available ");
           return true ;}
       else{ System.out.println("the room is not available");
           return false ;
       }
   
   } 
     public  boolean doubleRoomStatus(coustmer doubleBed[]){
       System.out.println("enter your room number");
       int number = input.nextInt();
       if(doubleBed[number].equals(null)){
           System.out.println("the room is Available ");
           return true ;}
       else{ System.out.println("the room is not available");
           return false ;
       }
   
   } 

}//end class Room

