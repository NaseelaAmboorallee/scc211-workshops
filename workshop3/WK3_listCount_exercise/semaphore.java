import java.util.*;
public class semaphore
{
    private int count = 0;

    public semaphore(int init_val){
        if (init_val >= 0) count = init_val;
    }

    public synchronized void P() {
        count = count - 1;
        if (count < 0) {
            try{
                wait();
            } catch(Exception e){ }
        }
    }

    public synchronized void V(){
        count = count + 1;
        if (count <= 0) {
            try{
                notify();
            } catch(Exception e){ }
        }
    }

}

