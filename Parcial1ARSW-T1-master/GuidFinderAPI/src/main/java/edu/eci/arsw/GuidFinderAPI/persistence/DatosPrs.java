/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderAPI.persistence;

import edu.eci.arsw.GuidFinderAPI.model.GuidFinder;
import java.util.List;

/**
 *
 * @author 2092692
 */
public interface DatosPrs {
    public List<GuidFinder> getDatos();
    public void postDatos(String guid);
}
