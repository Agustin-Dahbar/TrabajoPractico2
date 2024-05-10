package Punto7;

public class Computadora 
{
	
	private String marca;
	private TipoComputadora tipo;
	private Procesador procesador;
	private DVD dvd; //Puede ser null.
	
	
	public void prender() 
	{
		System.out.println("Prendiendo");
	}
	
	public void apagar() 
	{
		System.out.println("Apagando..");
	}
	
	public void reiniciar() 
	{
		System.out.println("Reiniciando..");
	}
}
