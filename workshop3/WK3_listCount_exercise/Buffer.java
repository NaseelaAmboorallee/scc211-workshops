import java.util.*;

public class Buffer 						//Provides data and operations onto the fixed-length queue
 {     									
  private LinkedList<Object> buf_list;		
  private int elements;						//Number of elements currently on the queue
  private int buf_size;						//Maximum number of elements allowed on queue
  private semaphore mutex;
  private semaphore empty;
  private semaphore full;

  public Buffer(int n)						//Queue creation, with n indicating the maximum capacity
   {
     buf_list = new LinkedList<Object>();
     elements = 0;
     buf_size = n;

     semaphore mutex = new semaphore(1);
     semaphore empty = new semaphore(0);
     semaphore full = new semaphore(n);

   }

  public void add(int item)						//Add element to queue
   {
     full.P();
     mutex.P();
     buf_list.add(item);
     mutex.V();
     empty.V();

   }

  public void finalSummation()				
   {								//Calculates the total sum of element value within the buffer
    int sum = 0;

    for (Object obj : buf_list){sum += (int)obj;}
     
    System.out.println("--------------------------");
    System.out.println("Count total: " + sum); 
    System.out.println("--------------------------");
    }
 }	
