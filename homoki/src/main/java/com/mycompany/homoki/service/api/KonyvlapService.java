/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.homoki.service.api;

import com.mycompany.homoki.datamodel.Konyvtipus;

/**
 *
 * @author homoki
 */
public interface KonyvlapService {
    public Konyvtipus getKonyvtipusByTitle(String pTitle) throws NullPointerException;   
}
