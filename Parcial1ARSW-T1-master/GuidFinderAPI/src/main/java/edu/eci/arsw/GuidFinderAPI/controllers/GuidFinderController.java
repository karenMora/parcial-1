/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderAPI.controllers;

import edu.eci.arsw.GuidFinderAPI.model.GuidRequest;
import edu.eci.arsw.GuidFinderAPI.persistence.DatosPrs;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2092692
 */
@RestController
@RequestMapping("/uuid")
@Service
@Controller
public class GuidFinderController {
    @Autowired
    DatosPrs dtsPrs;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getRecursos(){
        try{
            return new ResponseEntity<>(dtsPrs.getDatos(),HttpStatus.ACCEPTED);
        }catch(Exception e){
            Logger.getLogger(GuidFinderController.class.getName()).log(Level.SEVERE,null,e);
            return new ResponseEntity<>("No se encuentra el GuidFinder ingresado",HttpStatus.NOT_FOUND);
        }
    }
    
    //@RequestMapping(method = RequestMethod.POST,value ="/{fecha}/{guid}/{count}")
    @RequestMapping(method = RequestMethod.POST)
    //public  ResponseEntity<?> RegistrarRecursos(@RequestBody GuidRequest guid){
    public  ResponseEntity<?> RegistrarRecursos(@RequestBody String guid){
        try{
            dtsPrs.postDatos(guid);
            return new ResponseEntity<>(HttpStatus.CREATED);
            
        }catch(Exception e){
            Logger.getLogger(GuidFinderController.class.getName()).log(Level.SEVERE,null,e);
            return new ResponseEntity<>("Aun no funciona",HttpStatus.FORBIDDEN);
        }
    }
}
