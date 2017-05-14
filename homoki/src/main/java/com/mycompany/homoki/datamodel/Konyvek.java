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
public class Konyvek {
    protected long ID;
    protected int oldalszam;
    protected int kiadaseve;
    private String cim;
    private String szerzo;

    public Konyvek(long ID, int kiadaseve, int oldalszam, String cim, String szerzo) {
        this.ID = ID;
        this.kiadaseve = kiadaseve;
        this.oldalszam = oldalszam;
        this.cim = cim;
        this.szerzo = szerzo;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    
    public int getKiadaseve() {
        return kiadaseve;
    }

    public void setKiadaseve(int kiadaseve) {
        this.kiadaseve = kiadaseve;
    }

    public int getOldalszam() {
        return oldalszam;
    }

    public void setOldalszam(int oldalszam) {
        this.oldalszam = oldalszam;
    }

    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public void setSzerzo(String szerzo) {
        this.szerzo = szerzo;
    }
   
}
