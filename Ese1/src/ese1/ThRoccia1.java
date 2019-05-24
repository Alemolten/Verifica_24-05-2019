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
public class ThRoccia1 extends Thread{
    private DatiCondivisi ptrDati;
    
    public ThRoccia1(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    public void run() {
        try {
            ptrDati.getArrivoR1().acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRoccia2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Inizio disintegrazione prima roccia");
        
        Random r = new Random();
        
        try {
            Thread.sleep(r.nextInt(2)+1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRazzo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Fine disintegrazione prima roccia");
    }
}
