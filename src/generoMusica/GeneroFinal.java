package generoMusica;

public abstract class GeneroFinal {
     public abstract String[] combinarCaracterísticaGeneros(String[] Generos);
}

public class generoDefinitivo extends GeneroFinal {
    public String[] DescripcionFinal;
    public generoMusical generoMusical; 

   
    public String[] combinarCaracterísticaGeneros(String[] Generos) {
        DescripcionFinal = new String[Generos.length + 1];
         // Crear una instancia de generoMusical

        DescripcionFinal[0] = generoMusical.definirGeneroPrincipal(Generos[0]);

        for (int i = 1; i < Generos.length; i++) {
            DescripcionFinal[i] = generoMusical.definirGeneroPrincipal(Generos[i]);
        }

        return DescripcionFinal;
    }
}