/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homoki.service.memory;

import com.mycompany.homoki.datamodel.Ar;
import com.mycompany.homoki.datamodel.Konyvek;
import com.mycompany.homoki.datamodel.Album;
import com.mycompany.homoki.datamodel.Konyvtipus;
import com.mycompany.homoki.datamodel.Mennyiseg;
import com.mycompany.homoki.service.api.AlbumService;
import com.mycompany.homoki.service.api.KonyvlapService;
import java.util.List;

/**
 *
 * @author homoki
 */
public class AlbumServiceImpl implements AlbumService {
    
    private static final String KONYVTIPUS = "albumok";    
    KonyvekServiceImpl base = new KonyvekServiceImpl();
    KonyvlapService konyvlapService = new KonyvlapServiceImpl();
            
    @Override
    public Ar getAr(Album pAlbum, Mennyiseg pMennyiseg) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return base.getAr(ktp.getArak(), pAlbum, pMennyiseg);
    }

    @Override
    public Album getAlbumById(long id) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return (Album)base.getKonyvekById((List<Konyvek>)ktp.getKonyvek(), id);
    }

    @Override
    public Mennyiseg getMennyisegById(long id) throws NullPointerException {
        Konyvtipus ktp = konyvlapService.getKonyvtipusByTitle(KONYVTIPUS);
        return base.getMennyisegById(ktp.getMennyisegek(), id);
    }
 
}
