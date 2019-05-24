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
public class Ese1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi dati = new DatiCondivisi();
        ThRazzo1 thRa1 = new ThRazzo1(dati);
        ThRazzo2 thRa2 = new ThRazzo2(dati);
        ThRoccia1 thRo1 = new ThRoccia1(dati);
        ThRoccia2 thRo2 = new ThRoccia2(dati);
        
        Scanner input = new Scanner(System.in);
        String lettera = input.next();
        
        if(lettera.equals("S")) {
            thRa1.start();
            thRa2.start();
            thRo1.start();
            thRo2.start();
        }
    }
    
}
