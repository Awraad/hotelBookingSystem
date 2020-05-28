package hotelproject;


 import java.util.Scanner; 
public class Employee extends person {
     Scanner input=new Scanner(System.in);
   private Date hireDate;
   private double salary;
   private String ID;
   //private Date vacation;
   //private int currentYear=2017;
    public Employee(String FirstName , String LastName , Date DateOfBirth,Date hireDate, double salary, String ID) {
      super(FirstName,LastName,DateOfBirth);
        this.hireDate = hireDate;
        this.salary = salary;
        this.ID = ID;
    }
    public Employee(){
         
        this.hireDate = null;
        this.salary = 0.0;
        this.ID = null;
    }

   

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

   

   /* public void setVacation(Date vacation) {
        System.out.println("Enter the date of vacation :");
        int day=input.nextInt();
        int month=input.nextInt();
        int year=input.nextInt();
        vacation =new Date(day,month,year);
        
        if (this.vacation<4 ) 
            System.out.println("you allowed to take vacation");
        else 
               if(this.vacation>4&&this.vacation != currentYear)
                System.out.println("you allowed to take vacation");
        else 
            if(this.vacation>4)
                System.out.println("you can't take vacation because the maximum is 4 times a year!");
        
    }*/

    @Override
    public String toString() {
        return String.format("%s%nHire Date:%s%nsalary:%d%nEmployee ID:%s",super.toString() , hireDate , salary , ID) ;
    }

   
}
