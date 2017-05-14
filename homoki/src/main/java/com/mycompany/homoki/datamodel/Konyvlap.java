/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homoki.datamodel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author homoki
 */
public class Konyvlap {
    private List<Konyvtipus> konyvtipusok = new ArrayList<>();

    public List<Konyvtipus> getKonyvtipus() {
        return konyvtipusok;
    }

    public void setKonyvtipusok(List<Konyvtipus> konyvtipusok) {
        this.konyvtipusok = konyvtipusok;
    }
    
    public void addKonyvtipus(Konyvtipus konyvtipus) {
        this.konyvtipusok.add(konyvtipus);
    }
       
}
