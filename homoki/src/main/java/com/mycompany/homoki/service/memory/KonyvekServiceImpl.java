/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homoki.service.memory;

import com.mycompany.homoki.datamodel.Ar;
import com.mycompany.homoki.datamodel.Konyvek;
import com.mycompany.homoki.datamodel.Mennyiseg;
import java.util.List;

/**
 *
 * @author homoki
 */
public class KonyvekServiceImpl {

    public Ar getAr(List<Ar> pSource, Konyvek pKonyv, Mennyiseg pMennyiseg) throws NullPointerException{
        for(Ar item:pSource)
            if(
                item.getKonyv().equals(pKonyv) &&
                item.getMe().equals(pMennyiseg)
            )
                return item;
        throw new NullPointerException();
    
    }
    
    public Konyvek getKonyvekById(List<Konyvek > pSource, long id) throws NullPointerException{
        for(Konyvek item:pSource)
            if(item.getID() == id)
                return item;
        throw new NullPointerException();
    }
    
    public Mennyiseg getMennyisegById(List<Mennyiseg> pSource,long id) throws NullPointerException{
        for(Mennyiseg item:pSource)
            if(item.getID() == id)
                return item;
        throw new NullPointerException();
    }    
}
