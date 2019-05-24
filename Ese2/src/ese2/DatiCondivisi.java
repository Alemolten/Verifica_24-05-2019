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
public class DatiCondivisi {
    private ArrayList numeriGenerati;
    private int numeroElementi;
    private int numeroInseritiPari;
    private int numeroInseritiDispari;
    private int numeroLettiPari;
    private int numeroLettiDispari;
    private int numeroZero;
    
    public DatiCondivisi() {
        this.numeriGenerati = new ArrayList();
        this.numeroElementi = 0;
        this.numeroInseritiPari = 0;
        this.numeroInseritiDispari = 0;
        this.numeroLettiPari = 0;
        this.numeroLettiDispari = 0;
        this.numeroZero = 0;
    }

    public ArrayList getNumeriGenerati() {
        return numeriGenerati;
    }

    public int getNumeroElementi() {
        return numeroElementi;
    }

    public int getNumeroInseritiPari() {
        return numeroInseritiPari;
    }

    public int getNumeroInseritiDispari() {
        return numeroInseritiDispari;
    }

    public int getNumeroLettiPari() {
        return numeroLettiPari;
    }

    public int getNumeroLettiDispari() {
        return numeroLettiDispari;
    }

    public int getNumeroZero() {
        return numeroZero;
    }

    public void setNumeriGenerati(ArrayList numeriGenerati) {
        this.numeriGenerati = numeriGenerati;
    }

    public void setNumeroElementi(int numeroElementi) {
        this.numeroElementi = numeroElementi;
    }

    public void setNumeroInseritiPari(int numeroInseritiPari) {
        this.numeroInseritiPari = numeroInseritiPari;
    }

    public void setNumeroInseritiDispari(int numeroInseritiDispari) {
        this.numeroInseritiDispari = numeroInseritiDispari;
    }

    public void setNumeroLettiPari(int numeroLettiPari) {
        this.numeroLettiPari = numeroLettiPari;
    }

    public void setNumeroLettiDispari(int numeroLettiDispari) {
        this.numeroLettiDispari = numeroLettiDispari;
    }

    public void setNumeroZero(int numeroZero) {
        this.numeroZero = numeroZero;
    }
}
