/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homoki.service.api;

import com.mycompany.homoki.datamodel.Ar;
import com.mycompany.homoki.datamodel.Utikonyv;
import com.mycompany.homoki.datamodel.Mennyiseg;
/**
 *
 * @author homoki
 */
public interface UtikonyvService {
    
    public Ar getAr(Utikonyv pUtikonyv, Mennyiseg pMennyiseg) throws NullPointerException;
    public Utikonyv getUtikonyvById(long id) throws NullPointerException;
    public Mennyiseg getMennyisegById(long id) throws NullPointerException;  
}
