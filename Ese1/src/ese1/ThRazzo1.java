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
public class ThRazzo1 extends Thread{
    private DatiCondivisi ptrDati;
    
    public ThRazzo1 (DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    public void run() {
        System.out.println("Lancio primo razzo");
    }
}
