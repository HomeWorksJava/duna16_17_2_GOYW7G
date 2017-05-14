/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homoki.service.api;

import com.mycompany.homoki.datamodel.Ar;
import com.mycompany.homoki.datamodel.Ismeretterjeszto;
import com.mycompany.homoki.datamodel.Mennyiseg;
/**
 *
 * @author homoki
 */
public interface IsmeretterjesztoService {
    
    public Ar getAr(Ismeretterjeszto pIsmeretterjeszto, Mennyiseg pMennyiseg) throws NullPointerException;
    public Ismeretterjeszto getIsmeretterjesztoById(long id) throws NullPointerException;
    public Mennyiseg getMennyisegById(long id) throws NullPointerException;  
}
