package Punto11;

public class Turnera 
{
	private int ultimoNumero;
	
	//Creamos un constructor para en Punto9.Principal.java probemos si funcionan los metodos.
	public Turnera() 
	{
		ultimoNumero = 10;
	}
	
	//Otorgamos un proximo número a != con el último metodo, no lo retornamos.
	public void otorgarProximoNumero()
	{
		ultimoNumero++;
	}
	
	//Metodo que retorna el valor actual del número.
	public int obtenerUltimoNumeroOtorgado()
	{
		return ultimoNumero;
	}
	
	//Setter del valor del número.
	public void resetearContador(int valor) 
	{
		if(valor >= 0) 
		{
			ultimoNumero = valor;
		}
		else 
		{
			ultimoNumero = 0;
		}
	}
	
	//Si no le argumentamos un valor le asignamos 0.
	public void resetearContador() 
	{
		ultimoNumero = 0;
	}
	
	
}
