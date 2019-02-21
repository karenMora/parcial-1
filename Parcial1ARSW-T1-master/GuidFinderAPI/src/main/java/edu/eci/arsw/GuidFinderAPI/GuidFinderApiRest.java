/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderAPI;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author 2092692
 */
@RestController
@RequestMapping("/uuid")
public class GuidFinderApiRest {
    @Autowired
    Datos datos;
    
    @RequestMapping(method = RequestMethod.GET,value ="/{fecha}/{guid}/{count}")
    public ResponseEntity<?> getRecursos(@PathVariable("fecha") String fecha ,@PathVariable("guid") String guid,@PathVariable("count")int count){
        try{
            return new ResponseEntity<>(datos.getDatos(fecha,guid,count),HttpStatus.ACCEPTED);
        }catch(Exception e){
            Logger.getLogger(GuidFinderApiRest.class.getName()).log(Level.SEVERE,null,e);
            return new ResponseEntity<>("Error",HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping(method = RequestMethod.POST,value ="/{fecha}/{guid}/{count}")
    public void RegistrarRecursos(@PathVariable("fecha") String fecha ,@PathVariable("guid") String guid,@PathVariable("count")int count){
        
    }
}
