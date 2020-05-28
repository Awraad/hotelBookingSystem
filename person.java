package hotelproject;


import hotelproject.Date;


public class person {
   private String FirstName ;
   private String LastName ;
   private Date DateOfBirth ;

    public person() {
        this.DateOfBirth = null ;
        this.FirstName = null ;
        this.LastName = null ;
    }
   
   
   
   public person(String FirstName , String LastName , Date DateOfBirth){
     this.FirstName = FirstName ;
     this.LastName =LastName ;
     this.DateOfBirth = DateOfBirth ;
   }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
 @Override
 public String toString(){
    return String.format("first name: %s%nlast name: %s%ndate of birth:%s", FirstName , LastName , DateOfBirth);
 }
    
}
