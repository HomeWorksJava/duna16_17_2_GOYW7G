/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homoki.datamodel;

/**
 *
 * @author homoki
 */
public class Ar {
    private Konyvek konyv;
    private Mennyiseg me;
    private long ar;
    
    public Ar(Konyvek konyv, Mennyiseg me, long ar) {
        this.konyv = konyv;
        this.me = me;
        this.ar = ar;
    }
    
    public Konyvek getKonyv() {
        return konyv;
    }

    public void setKonyv(Konyvek konyv) {
        this.konyv = konyv;
    }

    public Mennyiseg getMe() {
        return me;
    }

    public void setMe(Mennyiseg me) {
        this.me = me;
    }

    public long getAr() {
        return ar;
    }

    public void setAr(long ar) {
        this.ar = ar;
    }
 
}
