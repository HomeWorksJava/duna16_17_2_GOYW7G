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
public class Konyvtipus {
    private String title ="";
    private List<? super Konyvek> konyvek = new ArrayList();    
    private List<Mennyiseg> mennyisegek = new ArrayList();
    private List<Ar> arak = new ArrayList();

    public Konyvtipus() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<? super Konyvek> getKonyvek() {
        return konyvek;
    }

    public void setKonyvek(List<? super Konyvek> konyvek) {
        this.konyvek = konyvek;
    }

    public void addKonyv(Konyvek konyv) {
        this.konyvek.add(konyv);
    }

    public List<Mennyiseg> getMennyisegek() {
        return mennyisegek;
    }

    public void setMennyisegek(List<Mennyiseg> mennyisegek) {
        this.mennyisegek = mennyisegek;
    }

    public void addMennyiseg(Mennyiseg mennyiseg) {
        this.mennyisegek.add(mennyiseg);
    }

    
    public List<Ar> getArak() {
        return arak;
    }

    public void setArak(List<Ar> arak) {
        this.arak = arak;
    }
    
    public void addAr(Ar ar) {
        this.arak.add(ar);
    }
    
  
}


