/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderAPI.model;

import java.util.UUID;

/**
 *
 * @author 2092692
 */
public class GuidRequest {
    private UUID uuid;
    
    public GuidRequest(){}
    
    public UUID getUuid(){return uuid;}
    public void setUuid(UUID uuid){ this.uuid=uuid;}
}
