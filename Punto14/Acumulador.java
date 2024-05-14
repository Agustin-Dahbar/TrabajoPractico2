package Punto14;

public class Acumulador 
{
	private int valor;
	
	
	public Acumulador() 
	{
		valor = 0;
	}
	//Setteamos el valor
	public void setValor(int valorAgregado) 
	{
		valor += valorAgregado;
	}
	
	//Getter del valor
	public int obtenerValor() 
	{
		return valor;
	}
}
