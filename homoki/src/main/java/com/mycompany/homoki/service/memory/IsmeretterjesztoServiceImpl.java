/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homoki.service.memory;

import com.mycompany.homoki.datamodel.Ar;
import com.mycompany.homoki.datamodel.Konyvek;
import com.mycompany.homoki.datamodel.Ismeretterjeszto;
import com.mycompany.homoki.datamodel.Konyvtipus;
import com.mycompany.homoki.datamodel.Mennyiseg;
import com.mycompany.homoki.service.api.IsmeretterjesztoService;
import com.mycompany.homoki.service.api.KonyvlapService;
import java.util.List;

/**
 *
 * @author homoki
 */
public class IsmeretterjesztoServiceImpl implements IsmeretterjesztoService {
    
    private static final String KONYVTIPUS = "ismeretterjesztő könyvek";    
    KonyvekServiceImpl base = new KonyvekServiceImpl();
    KonyvlapService konyvlapService = new KonyvlapServiceImpl();
            
    @Override
    public Ar getAr(Ismeretterjeszto pIsmeretterjeszto, Mennyiseg pMennyiseg) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return base.getAr(ktp.getArak(), pIsmeretterjeszto, pMennyiseg);
    }

    @Override
    public Ismeretterjeszto getIsmeretterjesztoById(long id) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return (Ismeretterjeszto)base.getKonyvekById((List<Konyvek>)ktp.getKonyvek(), id);
    }

    @Override
    public Mennyiseg getMennyisegById(long id) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return base.getMennyisegById(ktp.getMennyisegek(), id);
    }
 
}
