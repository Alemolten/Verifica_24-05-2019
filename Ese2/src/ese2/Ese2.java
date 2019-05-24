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
public class Ese2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi dati = new DatiCondivisi();
        ThGenera thG = new ThGenera(dati);
        ThContaPari thCP = new ThContaPari(dati);
        ThContaDispari thCD = new ThContaDispari(dati);
        ThVisualizza thV = new ThVisualizza(dati);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero di numeri da generare");
        int nGenerare = input.nextInt();
        
        dati.setNumeroElementi(nGenerare);
        
        thG.start();
        thCP.start();
        thCD.start();
        thV.start();
    }
    
}
