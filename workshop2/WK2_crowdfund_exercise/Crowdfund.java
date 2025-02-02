/*Week 2 Exercise - Crowd funding

This exercise you will show an implementation of a lock (mutex)*/

import java.util.*;
import java.lang.*;

public class Crowdfund { 
  /* The first class called in the program - creates number of donators, predicted funds, and final outcome*/
   public static void main (String arg[]) throws InterruptedException 
   {
     Scanner input = new Scanner(System.in);   
     ArrayList<Thread> t = new ArrayList<Thread>();
     ArrayList<funder> f = new ArrayList<funder>();
     int predictedDonations = 0;			//Variable declarations that can be potentially use
     int numUsers = 0;
 
     int donation = 5;						//The amount (�) that donators are able to contribute
     int actualDonations = 0;
     
     System.out.println("Please enter the total number of backers: ");
     numUsers = input.nextInt();
     
     predictedDonations = numUsers * donation;
     
     input.close();

     for (int i = 0;i < numUsers ; i++){
      funder donator = new funder();
      Thread t1 = new Thread(donator);
      f.add(donator);
      t.add(t1);
     }
     
     for (Thread thread : t){
      thread.start();
     }

     for (Thread thread : t){
      thread.join();
     }

     actualDonations = funder.account.readAccount();

 

     /*The developer wants to implement three things: 
     
     	1) Allow the user to specify the number of donators participating in the crowd sourcing
     2) Predict the total funds given a certain amount of users
     3) Emulate numerous funders actively providing donations, which subsequently update the total funding account
     4) Provide a numerial comparison between the predicted donations and actual donations
        
        Successful completion of this exercise will see predicted == actual donations, irrespective of thread generation and execution runs
     */   
        
        
     
     System.out.println("Num. of Contributors: " + numUsers);
     System.out.println("----------------");
     System.out.println("Predicted Donations: " + predictedDonations);
     System.out.println("Actual Donations: " + actualDonations);
   
	}																				
}