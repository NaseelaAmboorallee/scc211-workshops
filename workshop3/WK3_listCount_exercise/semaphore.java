import java.util.*;

public class semaphore {
    private int count = 0;

    public semaphore(int init_val) {
        if (init_val >= 0) {
            count = init_val;
        }
    }

    public synchronized void down() {
        count = count - 1;
        if (count < 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public synchronized void up(){
        count = count + 1;
        if (count <= 0) {notify();}
    }

}

