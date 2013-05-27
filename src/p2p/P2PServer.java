/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p2p;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p2p.server.Server;

/**
 *
 * @author Phani Rahul
 */
public class P2PServer {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Server s = new Server(2000);
            s.start();
        } catch (IOException ex) {
            Logger.getLogger(P2PServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
