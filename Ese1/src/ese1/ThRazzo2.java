/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author molteni_alessandro
 */
public class ThRazzo2 extends Thread{
    private DatiCondivisi ptrDati;
    
    public ThRazzo2(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    public void run() {
        System.out.println("Lancio secondo razzo");
        
        Random r = new Random();
        
        try {
            Thread.sleep(r.nextInt(2)+1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRazzo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Seconda roccia colpita");
        ptrDati.getArrivoR2().release();
    }
}
