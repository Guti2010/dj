package cancion;

import letraMusica.Letra;
import ritmoMusica.ritmo;
public abstract class Cancion {
	abstract void crearCancion(String[]generos,String tema);
	
}

class cancionFinal extends Cancion{
	private Letra lirica;
	private ritmo Instrumental;
	
	void crearCancion(String[]generos,String tema){
		System.out.print("Cancion hecha con generos, ritmo y tema definido");
		// se envia a cada parte de cancion los parametros
	}
}
