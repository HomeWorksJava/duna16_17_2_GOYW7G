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
public class Regeny extends Konyvek
{
    private String mufaj;

    public Regeny(String mufaj, long ID, int kiadaseve, int oldalszam, String cim, String szerzo) {
        super(ID, kiadaseve, oldalszam, cim, szerzo);
        this.mufaj = mufaj;
    }

    public String getMufaj() {
        return mufaj;
    }

    public void setMufaj(String mufaj) {
        this.mufaj = mufaj;
    }  
    
}
