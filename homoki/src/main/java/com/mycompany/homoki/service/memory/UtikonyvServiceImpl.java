/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homoki.service.memory;

import com.mycompany.homoki.datamodel.Ar;
import com.mycompany.homoki.datamodel.Konyvek;
import com.mycompany.homoki.datamodel.Utikonyv;
import com.mycompany.homoki.datamodel.Konyvtipus;
import com.mycompany.homoki.datamodel.Mennyiseg;
import com.mycompany.homoki.service.api.UtikonyvService;
import com.mycompany.homoki.service.api.KonyvlapService;
import java.util.List;

/**
 *
 * @author homoki
 */
public class UtikonyvServiceImpl implements UtikonyvService {
    
    private static final String KONYVTIPUS = "útikönyvek";    
    KonyvekServiceImpl base = new KonyvekServiceImpl();
    KonyvlapService konyvlapService = new KonyvlapServiceImpl();
            
    @Override
    public Ar getAr(Utikonyv pUtikonyv, Mennyiseg pMennyiseg) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return base.getAr(ktp.getArak(), pUtikonyv, pMennyiseg);
    }

    @Override
    public Utikonyv getUtikonyvById(long id) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return (Utikonyv)base.getKonyvekById((List<Konyvek>)ktp.getKonyvek(), id);
    }

    @Override
    public Mennyiseg getMennyisegById(long id) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return base.getMennyisegById(ktp.getMennyisegek(), id);
    }
 
}
