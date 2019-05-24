/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese2;

import java.util.*;

/**
 *
 * @author molteni_alessandro
 */
public class ThVisualizza extends Thread{
    DatiCondivisi ptrDati;
    
    public ThVisualizza(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    public void run() {
        int pariI = ptrDati.getNumeroInseritiPari();
        System.out.println("NumeroPariInseriti" + pariI);
        int dispariI = ptrDati.getNumeroInseritiDispari();
        System.out.println("NumeroDispariInseriti" + dispariI);
        int pariL = ptrDati.getNumeroLettiPari();
        System.out.println("NumeroPariLetti" + pariL);
        int dispariL = ptrDati.getNumeroLettiDispari();
        System.out.println("NumeroDispariLetti" + dispariL);   
        int zero = ptrDati.getNumeroZero();
        System.out.println("NumeroZero" + zero);  
    }
}
