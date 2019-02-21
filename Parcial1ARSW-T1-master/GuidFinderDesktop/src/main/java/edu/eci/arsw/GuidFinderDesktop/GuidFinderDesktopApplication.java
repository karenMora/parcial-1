package edu.eci.arsw.GuidFinderDesktop;

import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import edu.eci.arsw.GuidFinderDesktop.GuidFinder;

@SpringBootApplication
public class GuidFinderDesktopApplication{

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GuidFinderDesktopApplication.class, args);
                threads hilo1= new threads();
                threads hilo2= new threads();
                threads hilo3= new threads();
                threads hilo4= new threads();
                GuidFinder finder= new GuidFinder();
                int size=finder.getSize();
                int mitad=(size/2);
                int unc=(mitad/2);
                hilo1.run(finder, 0, unc);
                hilo2.run(finder,(unc+1),mitad );
                hilo3.run(finder,(mitad+1),unc );
                hilo4.run(finder,(unc+1),size);
		/*
		try {
                    //GuidFinder finder= new GuidFinder();
                    //System.out.println(finder.countGuids(UUID.fromString("d0692660-c39a-4d73-9496-d9df0c4ebdf3")));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
	}

}