/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.mycompany.homoki.datamodel.Regeny;
import com.mycompany.homoki.datamodel.Mennyiseg;
import com.mycompany.homoki.service.api.RegenyService;
import com.mycompany.homoki.service.memory.DataStore;
import com.mycompany.homoki.service.memory.RegenyServiceImpl;
import java.util.List;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author homoki
 */
@Path("regeny")
public class Regeny_resources {
    @Path("osszes")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getOsszesRegeny()
    {
        return DataStore.konyvlap.getKonyvtipus().get(2).getKonyvek();
    }
    
    @Path("me")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getOsszesme()
    {
        return DataStore.konyvlap.getKonyvtipus().get(2).getMennyisegek();
    }

    @Path("ar")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String getAr(@FormParam("regeny") int regenyid, @FormParam("me") int meid)
    {
        RegenyService serviceRegeny = new RegenyServiceImpl();
        Regeny regeny = serviceRegeny.getRegenyById(regenyid);
        Mennyiseg me = serviceRegeny.getMennyisegById(meid);
        return ""+serviceRegeny.getAr(regeny, me).getAr();   
    }
       
}
