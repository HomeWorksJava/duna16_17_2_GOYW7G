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
import com.mycompany.homoki.datamodel.Konyvlap;
import com.mycompany.homoki.datamodel.Regeny;
import com.mycompany.homoki.datamodel.Mennyiseg;
import com.mycompany.homoki.datamodel.Utikonyv;
import com.mycompany.homoki.datamodel.Szakkonyv;
import com.mycompany.homoki.datamodel.Ismeretterjeszto;
import java.util.List;

/**
 *
 * @author homoki
 */
public class DataStore {
    public static final Konyvlap konyvlap = new Konyvlap();

    static {
        Konyvtipus ktp = new Konyvtipus();
        ktp.setTitle("Albumok");
        
        List<? super Konyvek> album = ktp.getKonyvek();
        album.add(new Album("van Gogh", 0, 2005, 156, "Vincent van Gogh", "John Doe"));
        album.add(new Album("Tiziano", 1, 2006, 163, "Tiziano", "Gustav von Hockheim"));
        album.add(new Album("Munkácsy", 2, 2012, 96, "Munkácsi Mihály", "Paprika Jancsi"));

        List<Mennyiseg> mennyiseg = ktp.getMennyisegek();
        mennyiseg.add(new Mennyiseg(0, 66, 1, "keménykötés"));
        mennyiseg.add(new Mennyiseg(1, 82, 1, "puhakötés"));
        mennyiseg.add(new Mennyiseg(2, 11, 1, "keménykötés"));

        List<Ar> arak = ktp.getArak();
        arak.add(new Ar((Album)album.get(0), mennyiseg.get(0), 3500));
        arak.add(new Ar((Album)album.get(1), mennyiseg.get(1), 2900));
        arak.add(new Ar((Album)album.get(2), mennyiseg.get(2), 3300));

        konyvlap.addKonyvtipus(ktp);
        
        ktp = new Konyvtipus();
        ktp.setTitle("Ismeretterjesző könyvek");        
        List<? super Konyvek> ismeretterjeszto = ktp.getKonyvek();
        ismeretterjeszto.add(new Ismeretterjeszto("biológia", 0, 2001, 135, "Virágok és méhecskék", "M.T."));
        ismeretterjeszto.add(new Ismeretterjeszto("történelem", 1, 2011, 99, "Fegyverbe!", "János bácsi"));
        ismeretterjeszto.add(new Ismeretterjeszto("fizika", 2, 2006, 65, "Kísérletek", "prof. Ö."));

        mennyiseg = ktp.getMennyisegek();
        mennyiseg.add(new Mennyiseg(0, 133, 1, "puhakötés"));
        mennyiseg.add(new Mennyiseg(1, 82, 1, "puhakötés"));
        mennyiseg.add(new Mennyiseg(2, 216, 1, "puhakötés"));

        arak = ktp.getArak();
        arak.add(new Ar((Ismeretterjeszto)ismeretterjeszto.get(0), mennyiseg.get(0), 3300));
        arak.add(new Ar((Ismeretterjeszto)ismeretterjeszto.get(1), mennyiseg.get(1), 8600));
        arak.add(new Ar((Ismeretterjeszto)ismeretterjeszto.get(2), mennyiseg.get(2), 2400));
        
        konyvlap.addKonyvtipus(ktp);
              
        ktp = new Konyvtipus();
        ktp.setTitle("Regények");        
        
        List<? super Konyvek> regeny = ktp.getKonyvek();
        regeny.add(new Regeny("krimi", 0, 1982, 121, "Rejtélyes gyilkosság", "Mr. T."));
        regeny.add(new Regeny("sci-fi", 1, 2009, 303, "Sötétség", "MZ/X"));
        regeny.add(new Regeny("szépirodalom", 2, 2001, 192, "Makramé", "Schubert M."));

        mennyiseg = ktp.getMennyisegek();
        mennyiseg.add(new Mennyiseg(0, 255, 1, "puhakötés"));
        mennyiseg.add(new Mennyiseg(1, 11, 1, "puhakötés"));
        mennyiseg.add(new Mennyiseg(2, 81, 1, "keménykötés"));

        arak = ktp.getArak();
        arak.add(new Ar((Regeny)regeny.get(0), mennyiseg.get(0), 1900));
        arak.add(new Ar((Regeny)regeny.get(1), mennyiseg.get(1), 2800));
        arak.add(new Ar((Regeny)regeny.get(2), mennyiseg.get(2), 1600));
        
        konyvlap.addKonyvtipus(ktp);
        
        ktp = new Konyvtipus();
        ktp.setTitle("Szakkönyvek");        
        
        List<? super Konyvek> szakkonyv = ktp.getKonyvek();
        szakkonyv.add(new Szakkonyv("kertészet", 0, 2003, 221, "A kert", "Bálint gazda"));
        szakkonyv.add(new Szakkonyv("barkács", 1, 2014, 103, "Szerelj meg mindent", "ZZZ"));
        szakkonyv.add(new Szakkonyv("pénzügy", 2, 2008, 92, "A pénz szerepe", "dr P."));

        mennyiseg = ktp.getMennyisegek();
        mennyiseg.add(new Mennyiseg(0, 55, 1, "puhakötés"));
        mennyiseg.add(new Mennyiseg(1, 65, 1, "puhakötés"));
        mennyiseg.add(new Mennyiseg(2, 32, 1, "puakötés"));

        arak = ktp.getArak();
        arak.add(new Ar((Szakkonyv)szakkonyv.get(0), mennyiseg.get(0), 2600));
        arak.add(new Ar((Szakkonyv)szakkonyv.get(1), mennyiseg.get(1), 1800));
        arak.add(new Ar((Szakkonyv)szakkonyv.get(2), mennyiseg.get(2), 1300));
        
        konyvlap.addKonyvtipus(ktp);
        
        ktp = new Konyvtipus();
        ktp.setTitle("Útikönyvek");        
        
        List<? super Konyvek> utikonyv = ktp.getKonyvek();
        utikonyv.add(new Utikonyv("Olaszország", 0, 2016, 121, "Olaszország", "A.A."));
        utikonyv.add(new Utikonyv("Franciaország", 1, 2012, 109, "Franciaország", "B.B"));
        utikonyv.add(new Utikonyv("Albánia", 2, 2007, 133, "Albánia", "C.C."));

        mennyiseg = ktp.getMennyisegek();
        mennyiseg.add(new Mennyiseg(0, 55, 1, "puhakötés"));
        mennyiseg.add(new Mennyiseg(1, 65, 1, "puhakötés"));
        mennyiseg.add(new Mennyiseg(2, 32, 1, "puhakötés"));

        arak = ktp.getArak();
        arak.add(new Ar((Utikonyv)utikonyv.get(0), mennyiseg.get(0), 2300));
        arak.add(new Ar((Utikonyv)utikonyv.get(1), mennyiseg.get(1), 2300));
        arak.add(new Ar((Utikonyv)utikonyv.get(2), mennyiseg.get(2), 2300));
        
        konyvlap.addKonyvtipus(ktp);

    }    
}

