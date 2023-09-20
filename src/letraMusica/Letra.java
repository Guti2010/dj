package letraMusica;

import generoMusica.*;
public abstract class Letra {
    public abstract String crearLetraBase(String[] pGeneros,String Tema);
}

public class LetraFinal extends Letra {
    private generoDefinitivo generoFinal;
    private String Lirica;  

    public String crearLetraBase(String[] pGeneros,String Tema) {
        generoFinal = new generoDefinitivo(); // Crear una instancia de generoDefinitivo
        Lirica = "Letra base de "+ Tema + generoFinal.combinarCaracterísticaGeneros(pGeneros)[0]; // crear la base

        for (int i = 1; i < pGeneros.length; i++) { // ir modificando letra segun generos
            Lirica += generoFinal.combinarCaracterísticaGeneros(pGeneros)[i];
        }

        return Lirica;
    }
}