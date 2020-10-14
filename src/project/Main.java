package project;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SyncronizationSystem ss = new SyncronizationSystem();
 
        Machine m1 = new Machine();
        Machine m2 = new Machine();
        Machine m3 = new Machine();
        
        ss.addMachine(m1);
        ss.addMachine(m2);
        ss.addMachine(m3);
        
        CristianSyncAlgorithm ca = new CristianSyncAlgorithm( );
        
        
        ss.setSyncSysetem(ca);
        
        ss.Syncronized();
        
        
    }

}

