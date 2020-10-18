import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class calculation {
	public static void main(String arg[]) {

  		System.out.println("Commence execution of the two lists.");
        long start_time = System.currentTimeMillis();
           
  		Looper calc = new Looper();
        
               
        long end_time = System.currentTimeMillis();
      
        System.out.println("Time to complete: " + (end_time - start_time));
        System.out.println("List1: " + calc.listA.size() + "; List2: " + calc.listB.size());        
	}
}

