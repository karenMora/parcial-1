/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderAPI.model;

import java.util.Date;

/**
 *
 * @author 2092692
 */
public class GuidFinder {
    String fecha=null;
    String Guid=null;
    int Count=0;
    
    public GuidFinder(String fecha, String guid, int count){
        this.fecha=fecha;
        Guid=guid;
        Count=count;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGuid() {
        return Guid;
    }

    public void setGuid(String Guid) {
        this.Guid = Guid;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }
    
}
