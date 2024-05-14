package Punto14;

public class Promedio 
{
	//Atributos
	private Acumulador acumulador;
	private Contador contador;
	
	//Constructor por defecto
	public Promedio() 
	{
		
	}
	
	//Constructor con parametros
	public Promedio(Acumulador acumulador, Contador contador) 
	{
		this.acumulador = acumulador;
		this.contador = contador;
	}
	
	//Setter de los atributos
	public void setAcumulador(Acumulador acumulador) 
	{
		this.acumulador = acumulador;
	}
	
	public void setContador(Contador contador) 
	{
		this.contador = contador;
	}
	
	//Asignamos valores a los atributos.
	public void incrementar(int numeroReal) 
	{
		contador.sumaUno();
		acumulador.setValor(numeroReal);
	}
	
	//Obtenemos el promedio de los valores de los atributos
	public double obtenerValor() 
	{
		if(contador.obtenerValor() == 0) 
		{
			return 0;
		}
		
		return (double) acumulador.obtenerValor() / contador.obtenerValor();
	}
	
	
}
