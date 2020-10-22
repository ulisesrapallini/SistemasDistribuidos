package project;

import java.util.Date;
import java.net.InetAddress;

class Machine {

    private Direction dirIP;
    
    public Machine(Direction dir){
        this.dirIP = dir;
    }

    public void setDirection( Direction dir ){
         this.dirIP = dir;
    }
    
    public void setDirIPv4(Direction ip){
        this.dirIP = ip;
    }
    public InetAddress getDirIPV4(){
        return this.dirIP.getDirIPV4();
    }
    public int getPortReceive(){
        return this.dirIP.getPortReceive();
    }

    public int getPortSend(){
        return this.dirIP.getPortSend();
    }

    public void setTime(Date hora){
         ComunicationSystem cs;
         Message message = new Message();
         
         cs.Send(message, this);    
    }
    
    public Date getTime(){
        return new Date();
    } 
}