package hotelproject;



public class Events {
    private String EventName ;
    private Date EventDate;
    private double discount ;//calling total price method
   
       public Events() {
    }
    public Events(String EventName, Date EventDate, double discount) {
        this.EventName = EventName;
        this.EventDate = EventDate;
        this.discount = discount;
            }
      public Events(String EventName, Date EventDate ) {
        this.EventName = EventName;
        this.EventDate= EventDate;
     
    }

    public Date getEventDate() {
        return EventDate;
    }
    
        @Override
    public String toString(){
      return String.format("Event Name:%s%nEvent Date:%s%nEvent Date:%d", EventName , EventDate , discount);
    }
    
}
