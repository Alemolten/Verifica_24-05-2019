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
public class ThRoccia2 extends Thread{
    DatiCondivisi ptrDati;
    
    public ThRoccia2(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    public void run() {
        System.out.println("Seconda roccia colpita");
        System.out.println("Inizio disintegrazione seconda roccia");
        System.out.println("Fine disintegrazione seconda roccia");
    }
}
