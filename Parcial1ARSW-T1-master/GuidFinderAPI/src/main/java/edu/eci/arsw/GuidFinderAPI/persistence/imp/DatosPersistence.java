/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//https://chrome.google.com/webstore/detail/advanced-rest-client/hgmloofddffdnphfgcellkdfbfbjeloo/related
package edu.eci.arsw.GuidFinderAPI.persistence.imp;

import edu.eci.arsw.GuidFinderAPI.persistence.DatosPrs;
import edu.eci.arsw.GuidFinderAPI.model.GuidFinder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2092692
 */
//@Service
@Component("datos")
public class DatosPersistence implements DatosPrs{
    private final List<GuidFinder> guiFinder= new ArrayList<>();
    
    public DatosPersistence(){
        String Fecha = "2019-02-21T05:10:00";
        String Guid = "d0692660-c39a-4d73-9496-d9df0c4ebdf3";
        int Count = 0;
        GuidFinder guiFn= new GuidFinder(Fecha, Guid, Count);
        guiFinder.add(guiFn);
        
        String FechaB = "2018-07-21T05:10:00";
        String GuidB = "d0692660-c39a-4d73-9496-d9df0c4ebdf3";
        int CountB = 0;
        GuidFinder guiFnB= new GuidFinder(FechaB, GuidB, CountB);
        guiFinder.add(guiFnB);
    }

    @Override
    public void postDatos(String guid) {
        GuidFinder guidFinderB=null;
        //if(guiFinder.get(i).getGuid() != guid){
            java.util.Date fecha = new Date();
            String fch=fecha.toString();
            guidFinderB = new GuidFinder(fch, guid, 10);
        //}
        guiFinder.add(guidFinderB);
        //System.out.println("guiFinder "+guidFinderB.getFecha()+guidFinderB.getGuid()+guidFinderB.getCount());
    }

    @Override
    public List<GuidFinder> getDatos() {
        List<GuidFinder> datos = new ArrayList<>();
        for(int i=0; i< guiFinder.size();i++){
                datos.add(guiFinder.get(i));
        }
        return datos;
    }
    
}
