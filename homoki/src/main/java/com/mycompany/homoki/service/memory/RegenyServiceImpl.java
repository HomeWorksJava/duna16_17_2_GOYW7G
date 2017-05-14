/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homoki.service.memory;

import com.mycompany.homoki.datamodel.Ar;
import com.mycompany.homoki.datamodel.Konyvek;
import com.mycompany.homoki.datamodel.Regeny;
import com.mycompany.homoki.datamodel.Konyvtipus;
import com.mycompany.homoki.datamodel.Mennyiseg;
import com.mycompany.homoki.service.api.RegenyService;
import com.mycompany.homoki.service.api.KonyvlapService;
import java.util.List;

/**
 *
 * @author homoki
 */
public class RegenyServiceImpl implements RegenyService {
    
    private static final String KONYVTIPUS = "regények";    
    KonyvekServiceImpl base = new KonyvekServiceImpl();
    KonyvlapService konyvlapService = new KonyvlapServiceImpl();
            
    @Override
    public Ar getAr(Regeny pRegeny, Mennyiseg pMennyiseg) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return base.getAr(ktp.getArak(), pRegeny, pMennyiseg);
    }

    @Override
    public Regeny getRegenyById(long id) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return (Regeny)base.getKonyvekById((List<Konyvek>)ktp.getKonyvek(), id);
    }

    @Override
    public Mennyiseg getMennyisegById(long id) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return base.getMennyisegById(ktp.getMennyisegek(), id);
    }
 
}
