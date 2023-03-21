package Modelo;

public class Resultado {
	
	private Equipo equipo1;
	private Equipo equipo2;
	private int cantGoles1;
	private int cantGoles2;

	public Resultado(int goles1; int goles2){
		this.cantGoles1=goles1;
		this.cantGoles2=goles2;
	}
	if(cantGoles1>cantGoles2) {
		return equipo1;
	}else {
	   if(cantGoles1<cantGoles2) {
	   return equipo2;
	   else {
	   return 0;
	   }
	   }
	}
	
}
