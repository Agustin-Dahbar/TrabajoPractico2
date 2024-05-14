package Punto14;

public class Contador 
{
	private int valor;
	
	public Contador() 
	{
		valor = 0;
	}
	
	//Setter del valor
	public void sumaUno() 
	{
		valor++;
	}
	
	//Getter del valor.
	public int obtenerValor() 
	{
		return valor;
	}
}
