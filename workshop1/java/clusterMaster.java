import java.util.*;
import java.lang.*;


public class clusterMaster {
/* clusterMaster calls servers 1-4, and prints the total time taken to complete the entire program.*/
	public static void main (String arg[]) { 
	
	long startTime = System.currentTimeMillis();

      slaveCall call = new slaveCall();
      
      call.server1();
      call.server2();      
      call.server3();
      call.server4();
      
      long endTime = System.currentTimeMillis();
      System.out.println("Threads took " + (endTime - startTime) + " milliseconds to complete");
      
	}
	
}