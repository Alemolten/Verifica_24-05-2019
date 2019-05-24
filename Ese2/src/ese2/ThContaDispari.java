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
public class ThContaDispari {
    DatiCondivisi ptrDati;
    
    public ThContaDispari(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    public void run() {
        int posizione = ptrDati.getPosizione();
        ArrayList array = ptrDati.getNumeriGenerati();
        Object numero = array.get(posizione);
        int n = Integer.parseInt(numero.toString());
        if(n%2==0) {
        }
        else {
            int dispari = ptrDati.getNumeroLettiDispari();
            dispari = dispari + 1;
            ptrDati.setNumeroLettiDispari(dispari);
        }
    }
}
