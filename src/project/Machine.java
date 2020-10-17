package project;

import java.util.Date;



class Machine {

    private Direction dirIP;
    
    public Machine(Direction dir){}

    public void setDirection( Direction dir ){
         this.dirIP = dir;
    }

    public void setTime(Date hora){
             
    }
    
    public Date getTime(){
        return new Date();
    } 
}