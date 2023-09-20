package generoMusica;

public abstract class Genero {
    public String descripcionGenero;
    abstract String definirCaracterísticasGenero(String pGenero);
    abstract String definirGeneroPrincipal(String pPrimerGenero);
}

// En el mismo archivo o en otro archivo dentro del mismo paquete
class generoMusical extends Genero {
    String definirCaracterísticasGenero(String pGenero) {
        descripcionGenero = "Investigacion de " + pGenero;
        return descripcionGenero;
    }

    String definirGeneroPrincipal(String pPrimerGenero) {
        descripcionGenero = "Investigacion de " + pPrimerGenero;
        return descripcionGenero;
    }
}