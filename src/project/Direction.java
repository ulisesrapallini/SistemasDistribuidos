package project;
import java.net.InetAddress;

public class Direction {
    private String dirIPv4;

    public Direction(String dirIPv4){
        try{
            this.dirIPv4 = InetAddress.getByName(dirIPv4);
         }
         catch(Exception e){
 
         }
    }

}
