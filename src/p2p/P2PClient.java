/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Phani Rahul
 */
public class P2PClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {

            byte buf[]  = new byte[256];
            String hi = "this is the first hi that i'm sending to everyone in the network";
            DatagramSocket socket = new DatagramSocket();
            buf = hi.getBytes();
            DatagramPacket data = new DatagramPacket(buf, buf.length, InetAddress.getByName("255.255.255.255"), 2000);
            socket.send(data);

        } catch (UnknownHostException | SocketException ex) {
            Logger.getLogger(P2PClient.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
