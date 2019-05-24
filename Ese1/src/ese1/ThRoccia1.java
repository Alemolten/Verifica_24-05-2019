/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1;

import java.util.*;

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
        System.out.println("Prima roccia colpita");
        System.out.println("Inizio disintegrazione prima roccia");
        System.out.println("Fine disintegrazione prima roccia");
    }
}
