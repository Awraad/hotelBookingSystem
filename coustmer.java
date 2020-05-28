package hotelproject;


import hotelproject.person;
import hotelproject.Date;


public class coustmer extends person {

    private String Email;
    private String phoneNumber ;

    public coustmer() {
        this.Email = null ;
        this.phoneNumber = null ;
    }

    public coustmer(String FirstName , String LastName , Date DateOfBirth, String Email, String phoneNumber) {
        super(FirstName,LastName,DateOfBirth);
        this.Email = Email;
        this.phoneNumber = phoneNumber;
    }
    
    

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
     @Override
     public String toString(){
        return String.format("%s%nE-mail:%s%nPhone number:%s", super.toString() ,Email, phoneNumber ); 
     }
    
}
