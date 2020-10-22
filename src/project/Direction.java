package project;
import java.net.InetAddress;

public class Direction {

    private InetAddress dirIPv4;
    private int portSend;
    private int portReceive;

    public Direction(String dirIPv4, int portSend,int portReceive){
        try{
            this.dirIPv4 = InetAddress.getByName( dirIPv4);
            this.portSend = portSend;
            this.portReceive = portReceive;
         }
         catch(Exception e){
 
         }
    }

    public InetAddress getDirIPV4(){
        return this.dirIPv4;
    }
    public int getPortSend(){
        return this.portSend;
    }
    public int getPortReceive(){
        return this.portReceive;
    }

}
