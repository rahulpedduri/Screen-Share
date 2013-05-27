
package p2p.server;

import java.io.PrintWriter;
import java.net.DatagramPacket;

/**
 *
 * @author Phani Rahul
 */
public class ClientHandle implements Runnable {
    
    DatagramPacket data;

    public ClientHandle(DatagramPacket data) {
        this.data = data;
    }    

    @Override
    public void run() {
        
        try {
            PrintWriter pw=null;
        byte[] d = data.getData();
        String senten = new String(d);
        System.out.println("Data: "+senten);
        
        }catch(Exception e){
            System.out.println("Exception: "+ e);
        }finally{
          //  pw.close();          
        }
       
       
    }
    
}
