public class test {
    public static void main(String[] args){
        clusterMasterNew cmn = new clusterMasterNew();

        Thread t = new Thread(cmn);
        t.start();

    }
    
}

