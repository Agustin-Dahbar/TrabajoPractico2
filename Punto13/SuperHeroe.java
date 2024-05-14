package Punto13;

public class SuperHeroe 
{
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	//Constructor
	public SuperHeroe(String nombre, int fuerza, int resistencia, int superpoderes) 
	{
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.superpoderes = superpoderes;
	}
	
	//Setters de los 3 atributos int. Utilizamos un metodo que compruebe si el número argumentado es correcto y lo devuelve o si debe devolver algún límite.
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
	
	//Metodo que evaluará al número argumentado en los setters para ver si esta entre 0 y 100 o devolver el límite más cercano.
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
		else if(this.resistencia < rival.resistencia) 
		{
			triunfosRival++;
		}
		
		//Evaluamos los superpoderes
		if(this.superpoderes > rival.superpoderes) 
		{
			triunfosProta++;
		}
		else if(this.superpoderes < rival.superpoderes) 
		{
			triunfosRival++;
		}
		
		//Evaluamos que superheroe fue el ganador e imprimimos el resultado de la competencia.
		if(triunfosProta >= 2) //Si el prota ganó al menos 2 veces, triunfó. 
		{
			System.out.println("TRIUNFO.");
		}
		else if(triunfosRival >=2) //Si el rival ganó al menos 2 veces, triunfó 
		{
			System.out.println("DERROTA.");
		}
		else //Si ninguno ganó 2 veces, empataron.
		{
			System.out.println("EMPATE");
		}
	}

	//To String para que se puedan imprimir las instancias de clases con el constructor parametrizado.
	@Override
	public String toString() {
		return "SuperHeroe [Nombre = " + nombre + ", Fuerza = " + fuerza + ", Resistencia = " + resistencia
				+ ", Superpoderes = " + superpoderes + "]";
	}
	
}
