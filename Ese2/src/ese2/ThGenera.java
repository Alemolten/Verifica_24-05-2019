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
public class ThGenera extends Thread{
    DatiCondivisi ptrDati;
    
    public ThGenera(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    public void run() {
        Random r = new Random();
    }
}
