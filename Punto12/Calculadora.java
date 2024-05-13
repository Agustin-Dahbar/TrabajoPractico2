package Punto12;

public class Calculadora 
{
	//Metodo que realiza la suma.
	public int sumar(int a, int b) 
	{
		return a + b;
	}
	
	//Metodo que realiza la resta.
	public int restar(int a, int b) 
	{
		return a - b;
	}
	
	//Metodo que realiza la multiplicación
	public int multiplicar(int a, int b) 
	{
		return a * b;
	}
	
	//Público que realiza la división.
	public int dividir(int a, int b) 
	{
		if(b == 0) //Si el divisor es 0
		{
			return 0; // devolvemos 0.
		}
		else //Si no lo es
		{
			return a / b; //devolvemos el resultado de la división.
		}
	}
}
