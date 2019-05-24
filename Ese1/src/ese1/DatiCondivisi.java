/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese1;

import java.util.concurrent.Semaphore;

/**
 *
 * @author molteni_alessandro
 */
public class DatiCondivisi {
    private Semaphore arrivoR1;
    private Semaphore arrivoR2;
    
    public DatiCondivisi() {
        arrivoR1 = new Semaphore(0);
        arrivoR2 = new Semaphore(0);
    }
    
    public Semaphore getArrivoR1() {
        return arrivoR1;
    }
    
    public Semaphore getArrivoR2() {
        return arrivoR2;
    }
    
    public void setArrivoR1(Semaphore arrivoR1) {
        this.arrivoR1 = arrivoR1;
    }
    
    public void setArrivoR2(Semaphore arrivoR2) {
        this.arrivoR2 = arrivoR2;
    }
}
