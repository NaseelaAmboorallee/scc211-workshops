import java.util.*;

public class listCount { 
  

public static void main(String[] args) throws InterruptedException
  {
   ArrayList<Thread> t = new ArrayList<Thread>();
   ArrayList<user> u = new ArrayList<user>();
   int num_users = 0;
   int elements = 0;
   int bufferSize = 0;
   Scanner input = new Scanner(System.in);  
		
   System.out.println("Enter number of users:");			//Specify number of users
   num_users = input.nextInt();

   System.out.println("Enter number of elements per user:");		//Specify number of elements submitted per user	
   elements = input.nextInt();
   input.close();

   bufferSize = num_users * elements;
   
   Buffer b; 	
   b = new Buffer(bufferSize);						//Create buffer

   for (int i = 0;i < num_users ; i++){
    user usr = new user(i,elements,b);
    Thread t1 = new Thread(usr);
    u.add(usr);
    t.add(t1);
   }
   
   for (Thread thread : t){thread.start();}

   for (Thread thread : t){thread.join();}
   	
   //Create X users that will concurrently add elements to the Buffer object b
   //This can be performed by using an add() method within the Buffer class that needs to be completed.
   
   b.finalSummation();							//Calculate SUM of elements in buffer
  }
}

