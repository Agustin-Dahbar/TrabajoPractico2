package Punto6;

import java.util.Random;

public class Dado 
{
	private int valor; 
	
	//Constructor por defecto que inicializa valor en 1.
	public Dado() 
	{
		this.valor = 1;
	}
	
	//Constructor parametrizado que acepta los 6 primeros valores en el conteo natural.
	public Dado(int valorInicial) 
	{
		if(valorInicial >=1 && valorInicial <= 6) 
		{
			this.valor = valorInicial;
		}
		else 
		{
			System.out.println("El valor inicial debe estar entre 1 y 6. Se establecerá el valor a 1.");
			this.valor = 1;
		}
	}
	
	//Metodo para lanzar el dado.
	public int Lanzar() 
	{
		this.valor = (int)(Math.random() * 6 + 1); //Generamos un valor random entre 1 y 6. Los primeros 6 números indicados como posibilidades comienzan con la indexación en 0, por lo tanto debemos sumar 1. Para que pase de ser de 0 a 5 a de 1 a 6.
		return valor;
	}

	//Getter para obtener el atributo.
	public int getValor() 
	{
		return this.valor;
	}
	
	@Override
    public String toString() 
	{
        return  valor + " ";
    }
	
	
}