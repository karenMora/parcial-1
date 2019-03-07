/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderAPI.services;

import edu.eci.arsw.GuidFinderAPI.model.GuidFinder;
import edu.eci.arsw.GuidFinderAPI.persistence.DatosPrs;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2092692
 */
@Service
public class GuidFinderServices {
    @Autowired
    DatosPrs datos;
    
    public void postDatos(String guid) {
        datos.postDatos(guid);
    }

    public List<GuidFinder> getDatos(){
        return datos.getDatos();
    }
    
}
