package Punto13;

public class Test 
{
	public static void main(String[] args) 
	{
		SuperHeroe batman = new SuperHeroe("Batman", 90, 70, 0);
		SuperHeroe superman = new SuperHeroe("Superman", 95, 60, 70);
		
		batman.competir(superman); //Devuelve DERROTA.
		superman.competir(batman); //Devuelve TRIUNFO.
		
		//Crear mas superheroes y jugar para terminar el punto 13.
		SuperHeroe agustin = new SuperHeroe("Agustin Dahbar", 99, 99, 99);
		SuperHeroe edgar = new SuperHeroe("Edgar Ross", 2, 3, 5);
		
		agustin.competir(edgar); //Triunfo
		edgar.competir(agustin); //Derrota
		
	}
}
