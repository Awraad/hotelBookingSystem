package hotelproject;

import java.util.*;
public class Resrvation extends Room implements invoice {
   static Scanner input=new Scanner(System.in);
    private Date DateOfRes ;
    private int RoomNum ;
    private coustmer CoustmerInfo ;

    public Resrvation() {
        this.CoustmerInfo= null ;
        this.DateOfRes = null ;
    }
    public Date getDateOfRes() {
        return DateOfRes;
    }
    public void setDateOfRes(Date DateOfRes) {
        this.DateOfRes = DateOfRes;
    }
    public coustmer getCoustmerInfo() {
        return CoustmerInfo;
    }
    public void setCoustmerInfo(coustmer CoustmerInfo) {
        this.CoustmerInfo = CoustmerInfo;
    } 
     @Override
     public String toString(){
          return String.format("your Resrvation on:%s%ncoustmer informations:%n%s",DateOfRes ,CoustmerInfo);
    }
     public  void menu() {
  Scanner input = new Scanner(System.in);
    String Customer = null;
    int roomNum = 1;
     int Option;
   coustmer [] hotel = new coustmer[12];
     
    while ( roomNum  < 11 )
        {
            System.out.println("Hotel Booking Options");
            System.out.println("1: To checkin");
            System.out.println("2: To Display empty rooms");
            System.out.println("3: To checkout  ");
             
            Option = input.nextInt();
            
         switch (Option){
      case 1:    checkIn(hotel, RoomNum);     break;
      case 2:    isAvailbale(hotel,roomNum);  break;
      case 3:   checkout(hotel,RoomNum); break;
          default : System.out.println("invalid number !");
}//end switch
        }
    }//end menu
      @Override  
    public double totalPrice(int RoomNum){
        
        
        System.out.println("how many room you want ?");
        int room = input.nextInt();
        System.out.println("how many night you will stay ?");
        int night = input.nextInt();
          double total = room*night ;
          double [] payCoustmer = new double [12];
        return  payCoustmer[RoomNum]=total ;
          
      
    }
    public void coustmerInfo(coustmer [] hotel ,int roomNum){
        System.out.println(hotel[roomNum]);
            
    }
   public  boolean isAvailbale(coustmer hotel[], int RoomNum){
       System.out.println("enter your room number");
       int number = input.nextInt();
       if(hotel[number].equals(null)){
           System.out.println("the room is Available ");
           return true ;}
       else{ System.out.println("the room is not available");
           return false ;
       }
   
   }
   public void checkIn(coustmer[] hotel , int roomNum){
       if(isAvailbale(hotel,roomNum)){
         
           System.out.println("Enter date of reservation ");
           int dayRes=input.nextInt();
           int monthRes=input.nextInt();
           int YearRes=input.nextInt();
           DateOfRes=new Date(dayRes,monthRes,YearRes);
           System.out.println("Enter weather you want Room or Suit ?");
           String choice=input.next();
           if( choice instanceof Room ){
                  super.descprition();
           }
        
          coustmerInfo(hotel,roomNum);
           totalPrice(roomNum);
       }
       else {
           System.out.println("this room is not Available !!");
       }
   
   
   }
   public  void checkout(coustmer hotel[], int RoomNum){ //link to this when pressed the D key
       hotel[RoomNum]=null;
       
        }
  

}
