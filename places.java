/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelproject;


public abstract class places {
 protected String type;
protected boolean roomStatus;
protected  double rate;
  
  
  
 public  abstract void descprition();
 public abstract void setRate(String type);
 public abstract  boolean singleRoomStatus(coustmer singleBed[]);
 
 public abstract  boolean doubleRoomStatus(coustmer doubleleBed[]);
 
}
