import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class calculation {
	public static void main(String arg[]) throws InterruptedException{
                System.out.println("Commence execution of the two lists.");
                long start_time = System.currentTimeMillis();
           
                Looper calc = new Looper();
                Thread t1 = new Thread(calc);
                Thread t2 = new Thread(calc);

                t1.start();
                t2.start();

                t1.join();
                t2.join();
               
                long end_time = System.currentTimeMillis();
      
                System.out.println("Time to complete: " + (end_time - start_time));
                System.out.println("List1: " + calc.listA.size() + "; List2: " + calc.listB.size());        
	}
}


        /*Runnable r1 = new Runnable(){public void run(){calc.listOne();}};
        Runnable r2 = new Runnable(){public void run(){calc.listTwo();}};
   
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);  
        t1.start();
        t2.start();

        t1.join();
        t2.join();*/