/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Phani Rahul
 */
public class Server {
    int port;
    DatagramSocket socket;
    private ExecutorService pool;

    public Server(int port) throws IOException {
        this.port = port;
        socket = new DatagramSocket (port);
    }
     public void start() throws IOException{
         
         pool = Executors.newFixedThreadPool(2);
         while(true){
             byte[] data = new byte[256];
             DatagramPacket image  = new DatagramPacket(data, data.length);
             socket.receive(image);
//             client = socket.accept();  
             pool.execute(new ClientHandle(image));
             
         }
     }
    
}
