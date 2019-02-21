/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderAPI;

import org.springframework.stereotype.Service;

/**
 *
 * @author 2092692
 */
@Service
public class DatosStub implements Datos{

    @Override
    public Object getDatos(String fecha, String guid, int count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void postDatos(String fecha, String guid, int count) {
        GuidFinder guidFinder = new GuidFinder(fecha, guid, count);
    }
    
}
