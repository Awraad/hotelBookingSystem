package hotelproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author awraad
 */
public class Date {
      private int dd;
    private int mm;
    private int yyyy;
    
    private  final int MONTHS_IN_YEAR=12;
    public Date(int dd, int mm, int yyyy) {
        this.dd = dd;
        this.mm = mm;
        this.yyyy = yyyy;
    }
     public Date(int dd, int mm) {
        this.dd = dd;
        this.mm = mm;
        
    }
    public void setDate(int dd ,  int  mm , int yyyyy){
    
    
    }
    
    public int getDd() {
    
        return dd;
    }
    public void setDd(int dd) {
        this.dd = dd;
    }
    public int getMm() {
        return mm;
    }
    public void setMm(int mm) {
      
        this.mm = mm;
     
    }
    public int getYyyy() {
        return yyyy;
    }
    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }
    
    
    
    public String toString(){
    
        
   
        return String.format("%02d/%02d/%04d%n",dd,mm,yyyy );
        
    }
}
