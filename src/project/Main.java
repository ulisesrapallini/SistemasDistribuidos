package project;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ComunicationSystem cs = new ComunicationSystem();
        Message ms = new Message();
        cs.Send(ms, "127.0.0.1", 3000);
        String ack =  cs.Receive(2500);
        if(ack == "ACK"){
           String respuesta = cs.Receive(2500);     
        }


        //ComunicationSystem cs = new ComunicationSystem();
         String mensajerecibido =  cs.Receive(3200);
         System.out.println(mensajerecibido);

        /*
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

        */
        
    }

}

