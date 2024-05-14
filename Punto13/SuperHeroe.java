package Punto13;

public class SuperHeroe 
{
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	//Setters de los 3 atributos int.
	public void setFuerza(int fuerza) 
	{
		this.fuerza = validarDatos(fuerza);
	}
	
	public void setResistencia(int resistencia) 
	{
		this.resistencia = validarDatos(resistencia);
	}
	
	public void setSuperpoderes(int superpoderes) 
	{
		this.superpoderes = validarDatos(superpoderes);
	}
	
	
	//Metodo en el que competirán los dos superheroes
	public void competir(SuperHeroe rival) 
	{
		int triunfosProta = 0;
		int triunfosRival = 0;
		
		//Evaluamos la fuerza.
		if(this.fuerza > rival.fuerza) 
		{
			triunfosProta++;
		}
		else if(this.fuerza < rival.fuerza)
		{
			triunfosRival++;
		}
		
		//Evaluamos la resistencia
		if(this.resistencia > rival.resistencia) 
		{
			triunfosProta++;
		}
		else if(this.resistencia > rival.resistencia) 
		{
			triunfosRival++;
		}
		
		//Evaluamos los superpoderes
		if(this.superpoderes > rival.superpoderes) 
		{
			triunfosProta++;
		}
		else if(this.superpoderes > rival.superpoderes) 
		{
			triunfosRival++;
		}
		
		//Evaluamos que superheroe fue el ganador e imprimimos el resultado de la competencia.
		if(triunfosProta > triunfosRival) 
		{
			System.out.println("TRIUNFO.");
		}
		else if(triunfosProta < triunfosRival) 
		{
			System.out.println("DERROTA.");
		}
		else 
		{
			System.out.println("EMPATE");
		}
	}
	
	@Override
	public String toString() {
		return "SuperHeroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}

	//Metodo que nos devolverá el número que asignaremos al atributo, el número que se le argumente a los setters irá hacia este metodo y lo convertirá en el valor final del atributo.
	public int validarDatos(int numero) 
	{
		if(numero >= 0 && numero <= 100)  // De 0 a 100
		{
			return numero;
		}
		else if(numero > 100) //A partir de 101
		{
			return 100;
		}
		else  //Números negativos (menos de 0)
		{
			return 0;
		}
	}
	
}
