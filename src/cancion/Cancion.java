package cancion;

import letraMusica.Letra;
import ritmoMusica.ritmo;
public abstract class Cancion {
	public abstract String crearCancion(String[]generos,String tema);
	
}

public class cancionFinal extends Cancion{
	private Letra lirica;
	private ritmo Instrumental;
	private String CancionFinal;
	
	public String crearCancion(String[]generos,String tema){
		CancionFinal = lirica.crearLetraBase(generos, tema)+ Instrumental.crearRitmoBase(generos);
		return CancionFinal;
	}
	
}
