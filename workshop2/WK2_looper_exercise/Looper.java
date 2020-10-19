import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Looper implements Runnable{
    
     Random rand = new Random();
    
     /*You can decide whether you wish to implement locks
     	method or code block - I would advise you try
        both out to see for yourself */
     
     List<Integer> listA = new ArrayList<Integer>();
     List<Integer> listB = new ArrayList<Integer>();
      
    public synchronized void listOne() {

            listA.add(rand.nextInt(100));
 
    }
    
    public synchronized void listTwo() {
                    
            listB.add(rand.nextInt(100));
       
    }

    public void run(){
        readList();
    }
    
    public void readList() {
        for(int i=0; i<500; i++) {
            listOne();
            listTwo();
        }
    }  
}

