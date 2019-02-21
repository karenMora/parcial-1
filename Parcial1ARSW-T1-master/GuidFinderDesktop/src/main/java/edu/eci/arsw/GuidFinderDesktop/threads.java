/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.GuidFinderDesktop;

import edu.eci.arsw.GuidFinderDesktop.GuidFinder;
import java.util.UUID;
/**
 *
 * @author 2092692
 */
public class threads extends Thread{
    
    public void run(GuidFinder finder,int a, int b) throws Exception{
        //GuidFinder finder= new GuidFinder();
        System.out.println(finder.countGuids(UUID.fromString("d0692660-c39a-4d73-9496-d9df0c4ebdf3")));
    }
}
