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
public class Utikonyv extends Konyvek
{
    private String orszag;

    public Utikonyv(String orszag, long ID, int kiadaseve, int oldalszam, String cim, String szerzo) {
        super(ID, kiadaseve, oldalszam, cim, szerzo);
        this.orszag = orszag;
    }

    public String getOrszag() {
        return orszag;
    }

    public void setOrszag(String orszag) {
        this.orszag = orszag;
    }  
    
}
