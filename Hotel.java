package hotelproject;



import java.util.*;


public class Hotel implements invoice{
  static  Scanner input=new Scanner(System.in);
    private String HotelAdress;
  //  ArrayList<Room> rooms=new ArrayList();
    //ArrayList<Suits> suits=new ArrayList();
    static ArrayList<Events> events=new ArrayList();
    private String HotelName;
    private String HotelOwner;
    private static int NbEmployee;
    private Date openingDate;
  
   
    
    public Hotel(){
     
        this.HotelAdress="";
        this.HotelName="";
        this.HotelOwner="";
        this.NbEmployee=0;
    }

    public Hotel(String HotelAdress, String HotalAdress, String HotelName, String HotelOwner, Date openingDate, Employee employee) {
        this.HotelAdress = HotelAdress;
        this.HotelAdress = HotalAdress;
        this.HotelName = HotelName;
        this.HotelOwner = HotelOwner; 
        this.openingDate = openingDate;
         employee=new Employee();
    }

    public String getHotelAdress() {
        return HotelAdress;
    }

    public void setHotelAdress(String HotelAdress) {
        this.HotelAdress = HotelAdress;
    }
     public String getHotelName() {
        return HotelName;
    }
    public void setHotelName(String HotelName) {
        this.HotelName = HotelName;
    }
    public String getHotelOwner() {
        return HotelOwner;
    }
    public void setHotelOwner(String HotelOwner) {
        this.HotelOwner = HotelOwner;
    }
    public static int getNbEmployee() {
        return NbEmployee;
    }
    public static void setNbEmployee(int NbEmployee) {
        Hotel.NbEmployee = NbEmployee;
    }
    public Date getOpeningDate() {
        return openingDate;
    }
    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }
    
    public void checkEvents(){
       events.add(new Events("Ramadan",new Date(1,9)));
       events.add(new Events("Eid Fater", new Date(1,10)));
       events.add(new Events("Eid Adha", new Date(10,12)));
       events.add(new Events("Saudi National Day", new Date(17,5)));
    }
    public double EventDiacount(double price , Date res){
      
        double discount=0.0;
        for(int x=0;x<4;x++){
        if(    events.get(x).getEventDate().equals(res)){
            System.out.println(events.get(x)+" so there is discount for this event");
         return discount= price /2;
        }}  
        return price;
   
    }
      @Override
    public String toString() {
        return "Hotel{" + "HotelAdress=" + HotelAdress + ", HotalAdress=" + HotelAdress + ", HotelName=" + HotelName + ", HotelOwner=" + HotelOwner + ", openingDate=" + openingDate + '}';
    } 
     
}
