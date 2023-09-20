package ritmoMusica;

import generoMusica.Genero;
import letraMusica.Letra;
public abstract class ritmo {
	
	abstract Genero crearRitmo();
	abstract void combinarRitmos();
	abstract void adaptarLetra(Letra pLetra);
}

class ritmoFinal extends ritmo{
	private Genero generos;
	private Letra letra;
	Genero crearRitmo() { 
		System.out.print("");
		return generos;

	}
	void combinarRitmos() {
		System.out.print("Ritmo combinado con todos géneros");
	}
	
	void adaptarLetra(Letra pletra) {
		System.out.print("Ritmo adaptado a letra");
	}
	
}