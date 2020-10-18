import java.util.*;
import java.lang.*;


public class clusterMasterNew {
/* clusterMaster calls servers 1-4, and prints the total time taken to complete the entire program.*/
	public static void main (String arg[]) throws InterruptedException{ 
      long startTime = System.currentTimeMillis();
	
      //clusterMasterNew cmn = new clusterMasterNew();

      slaveCall call = new slaveCall();
      Runnable r1 = new Runnable(){public void run(){call.server1();}};
      Runnable r2 = new Runnable(){public void run(){call.server2();}};
      Runnable r3 = new Runnable(){public void run(){call.server3();}};
      Runnable r4 = new Runnable(){public void run(){call.server4();}};


      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);
      Thread t3 = new Thread(r3);
      Thread t4 = new Thread(r4);


      t1.start();
      t2.start();
      t3.start();
      t4.start();

      t1.join();
      t2.join();
      t3.join();
      t4.join();
      
      long endTime = System.currentTimeMillis();
      System.out.println("Threads took " + (endTime - startTime) + " milliseconds to complete");
      }

}