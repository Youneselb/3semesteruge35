/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Aliapoulsen
 */
public class AnimalNoDB {

    public AnimalNoDB() {
    }
    
    private String type;
    private String sound;
    
       
    public AnimalNoDB(String type, String sound) {
    this.type = type;
    this.sound = sound;
    }
}
   