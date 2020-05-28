package hotelproject;

import java.util.*;
public class manager  extends Employee{
    
    Scanner input=new Scanner(System.in);
    
    
    
    boolean check=false;
  double hourWork;
  final double payRate=100.0;
 int  vacation;
   double rateOfServices=0;  
   ArrayList <Employee> myEmployee = new ArrayList (); 

    public manager() {
    }
   
   public manager(String FirstName , String LastName , Date DateOfBirth,Date hireDate, double salary, String ID){
        super(FirstName,LastName,DateOfBirth,hireDate,salary,ID);
       }
  
  public void hireEmployee(){
      System.out.println("Enter first name :");
       String FirstName=input.next() ;
       System.out.println("Enter last name:");
       String LastName=input.next() ;
       System.out.println("Enter date of birth");
       int day=input.nextInt();
       int month=input.nextInt();
       int year=input.nextInt();
       Date DateOfBirth=new Date(day,month,year);
        System.out.println("Enter date of hire date ");
       int hday=input.nextInt();
       int hmonth=input.nextInt();
       int hyear=input.nextInt();
       Date hireDate=new Date(hday,hmonth,hyear);
       System.out.println("Enter your salary ");
       double salary=input.nextDouble();
       System.out.println("Enter ID");        
       String ID=input.nextLine();
     
           myEmployee.add(new Employee(FirstName,LastName,DateOfBirth,hireDate,salary,ID));
  }

 
   public void salary(){
       System.out.println("Enter hours worked : ");
       hourWork=input.nextDouble();
       if( hourWork<=40 ){
    double gossPay=payRate*hourWork;
           System.out.println(  gossPay );}
       else{
           double basicPay=payRate*40;
           double overTime=hourWork-40;
           double overTimePay=1.5*payRate*overTime;
           double grossPay=basicPay+overTimePay;
         
       }
   } 
 public void isEmployee ( Employee e) {
            for (int x = 0; x < myEmployee.size(); x++) {
                if (myEmployee.get(x).getFirstName().equals(e)){
                check=true; break;
                }
                if(check)
                        System.out.println("is an Employee ");
                else
                        System.out.println("is not an Employee ");
            
            }
 }
  public  void find(coustmer hotel[]){

            System.out.println(" find room number from coustmer name ");
        Scanner input = new Scanner(System.in);   
        System.out.println("Enter customer name for room:" );
        String customersname;
        customersname = input.next();  //stores name they enter as customers name
        for (int x = 0; x < 10; x++ )
        {
            if (hotel[x].equals(customersname))
                System.out.println("room " + x + " is occupied  by "+hotel[x]);

}
    }
    public static void initialise( coustmer [] hotel )
    {
        
            System.out.println(" to initialise  all rooms");
        for (int x = 1; x < 11; x++ )
            hotel[x] = null;
        System.out.println( "Welcome to The hotel");
    } 
}
    


