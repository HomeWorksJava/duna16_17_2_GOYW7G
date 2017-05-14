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
public class Mennyiseg {
    private long ID;
    private int mennyiseg;
    private int kotetekszama;
    private String kotestipusa;

    public Mennyiseg(long ID,int mennyiseg, int kotetekszama, String kotestipusa) {
        this.ID = ID;
        this.mennyiseg = mennyiseg;
        this.kotetekszama = kotetekszama;
        this.kotestipusa = kotestipusa;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public int getKotetekszama() {
        return kotetekszama;
    }

    public void setKotetekszama(int kotetekszama) {
        this.kotetekszama = kotetekszama;
    }

    public String getKotestipusa() {
        return kotestipusa;
    }

    public void setKotestipusa(String kotestipusa) {
        this.kotestipusa = kotestipusa;
    }  
}

