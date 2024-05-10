package Punto7;

public class Procesador 
{
	//Atributos del procesador.
	private String marca;
	private String modelo;
	private int nivelTemperatura;
	
	//Metodo que imprimirá cuando el nivel de temperatura del procesador supere el 95%.
	public void nivelTemperaturaCritica()
	{
		if(nivelTemperatura > 95) 
		{
			System.out.println("La temperatura del CPU superó 95%.. Cuidado..");
		}
	}
}
