package project;

import java.net.*;

class ComunicacionSystem {
   
    private DatagramSocket DatagramSockSend;
    private DatagramSocket DatagramSockReceive;
    
   public void ComunicationSystem(){
       
   }
    
   public void Send(String message, String Destino, int port){
        try {
            DatagramPacket paqueteUDP;
            InetAddress dir_remota = InetAddress.getByName( Destino );
            byte[] buffer = message.getBytes(); // retorna los bytes del string
            paqueteUDP = new DatagramPacket(buffer, buffer.length, dir_remota, port);
            DatagramSockSend = new DatagramSocket();
            DatagramSockSend.send(paqueteUDP);
        }
        catch(Exception e){
             
        }
   }   
    
   public String Receive(int port){
       int longitdmensaje = 100;
       byte pkg_byte[] = new byte[1];
       try {
           byte buffer[] = new byte[longitdmensaje]; //buffer solo para el DatagramPacket
            DatagramPacket dp = new DatagramPacket( buffer, longitdmensaje);
            DatagramSockReceive = new DatagramSocket(port);
            DatagramSockReceive.receive(dp); //lee los datos
            pkg_byte = new byte[dp.getLength()]; //array de bytes para los datos
            pkg_byte = dp.getData(); // asigna los bytes de datos       
       }
       catch(Exception e){
           
       }
       return new String(pkg_byte);
   } 
    
    
}