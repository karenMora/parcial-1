/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderAPI;

/**
 *
 * @author 2092692
 */
public interface Datos {
    public Object getDatos(String fecha, String guid, int count);
    public void postDatos(String fecha, String guid, int count);
}
