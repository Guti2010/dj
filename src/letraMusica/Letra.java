package letraMusica;
import generoMusica.Genero;

public abstract class Letra {
	
	abstract String crearLetra(String generos,String tema);
	abstract void modificarConGeneros();
}
 class LetraFinal extends Letra{
	 private Genero genero;
	 String crearLetra(String caracteristicas,String tema){
		 return "Letra con los generos";
	 }
	 void modificarConGeneros() {
		 String caracteristicasCancion=genero.definirCaracterísticasCancion();
		 // letra modificada según ritmos, según cual se dicen una u otras cosas
	 }
	 
 }