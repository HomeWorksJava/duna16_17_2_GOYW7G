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
public class Szakkonyv extends Konyvek
{
    private String temakor;

    public Szakkonyv(String temakor, long ID, int kiadaseve, int oldalszam, String cim, String szerzo) {
        super(ID, kiadaseve, oldalszam, cim, szerzo);
        this.temakor = temakor;
    }

    public String getTemakor() {
        return temakor;
    }

    public void setTemakor(String temakor) {
        this.temakor = temakor;
    }  
    
}
