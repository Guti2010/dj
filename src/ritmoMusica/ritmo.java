package ritmoMusica;

import letraMusica.Letra;
import generoMusica.*;
public abstract class ritmo {
    public abstract String crearRitmoBase(String[] pGeneros);
    public abstract String modificarConLetra(String[] pGeneros);
}

public class RitmoFinal extends ritmo {
    private generoDefinitivo generoFinal;
    private Letra Lirica;  
    private String Ritmo;

    public String crearRitmoBase(String[] pGeneros) {
        
        Ritmo = "Ritmo base " + generoFinal.combinarCaracterísticaGeneros(pGeneros)[0]; // crear la base

        for (int i = 1; i < pGeneros.length; i++) { // ir modificando letra segun generos
            Ritmo += generoFinal.combinarCaracterísticaGeneros(pGeneros)[i];
        }

        return Ritmo;
    }
    
    public String modificarConLetra(String[] pGeneros) {
    	Ritmo += Lirica.crearLetraBase(pGeneros);
    	return Ritmo;	
    }
}