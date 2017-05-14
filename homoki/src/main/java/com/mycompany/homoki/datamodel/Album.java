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
public class Album extends Konyvek
{
    private String muveszneve;

    public Album(String muveszneve, long ID, int kiadaseve, int oldalszam, String cim, String szerzo) {
        super(ID, kiadaseve, oldalszam, cim, szerzo);
        this.muveszneve = muveszneve;
    }

    public String getMuveszneve() {
        return muveszneve;
    }

    public void setMuveszneve(String muveszneve) {
        this.muveszneve = muveszneve;
    }  
    
}

