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
public class ThContaPari extends Thread{
    DatiCondivisi ptrDati;
    
    public ThContaPari(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    public void run() {
        int posizione = ptrDati.getPosizione();
        ArrayList array = ptrDati.getNumeriGenerati();
        Object numero = array.get(posizione);
        int n = Integer.parseInt(numero.toString());
        if(n!=0) {
            if(n%2==0) {
                int pari = ptrDati.getNumeroLettiPari();
                pari = pari + 1;
                ptrDati.setNumeroLettiPari(pari);
            }
        }
        else {
            int zero = ptrDati.getNumeroZero();
            zero = zero + 1;
            ptrDati.setNumeroZero(zero);
        }
    }
}
