package reproductor;

import cancion.Cancion;

public class Main {
	private Cancion Music;
	public String[] generos;
	public void main(String arg[]) {
		generos = new String[3]; // modificar segun los que se quieran
		generos[0] = "salsa";
	    generos[1] = "pop";
	    generos[2] = "bachata";
		Music.crearCancion(generos,"desamor");
		
	}
	

}
