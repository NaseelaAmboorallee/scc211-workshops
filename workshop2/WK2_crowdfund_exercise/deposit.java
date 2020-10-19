/*Week 2 Exercise - Crowd funding

This exercise you will show an implementation of a lock (mutex)*/

import java.util.*;
import java.lang.*;

public class deposit {
  /*Increment the donation account as donators contribute */

  public  int readAccount()						//Reads the current account balance
  {    

    
    return balance;
  }
  
  public synchronized int deposit_funds(int amount)					//Increments when a funder provides a donation
  {
    balance = balance + amount;
    
    return 5;
  }      
}

