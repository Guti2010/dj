package generoMusica;

public abstract class Genero {
	String[] generos;
	
	abstract String definirCaracterísticasCancion();
	abstract String[] getGeneros();
}

class generoMusical extends Genero{
	private String[] generos;
	
	String[] getGeneros(){
		return generos;
	}
	
	String definirCaracterísticasCancion() {
		
		System.out.print("Características de generos bombinadas");
		return "Caracteristicas";
		
	}
	
	
	
}
