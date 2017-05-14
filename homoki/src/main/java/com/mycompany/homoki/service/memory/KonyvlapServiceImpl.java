/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homoki.service.memory;

import com.mycompany.homoki.datamodel.Konyvtipus;
import com.mycompany.homoki.service.api.KonyvlapService;

/**
 *
 * @author homoki
 */
public class KonyvlapServiceImpl implements KonyvlapService {
    
    @Override
    public Konyvtipus getKonyvtipusByTitle(String pTitle) throws NullPointerException{
        for(Konyvtipus item:DataStore.konyvlap.getKonyvtipus())
            if(item.getTitle().equals(pTitle))
                return item;
        throw new NullPointerException();
    }
}