/*Week 2 Exercise - Crowd funding

This exercise you will show an implementation of a lock (mutex)*/

import java.util.*;
import java.lang.*;

public class funder implements Runnable{ 
  /*The donator is responsible for depositing their donation into the bank account */
  
  public static deposit account = new deposit();			//Would advise that you leave this line of code here
   			 
  											//Hint, you will want to implement one of the deposit methods in here somewhere...
  public void run(){
      account.deposit_funds(5);
  } 
  
  }    

