package Punto2;

import Punto5.Domicilio; //Punto 5B)
import Punto7.Computadora; //Punto 7

public class Persona 
{
	private String nombre;
	private String apellido;
	private Domicilio domicilio;//Punto 5B)
	private int DNI; //Punto 7.
	private Computadora computadora; //Punto 7
	private Persona pareja; //Punto 9

	//Punto 3 Crear constructor y metodo obtenerNombreCompleto() (líneas 13 y 31)	
	public Persona() 
	{
		this.nombre = "";
		this.apellido = "";
	}
	
	public Persona(String nombre, String apellido, Domicilio domicilio, int DNI) //Constructor que necesitaré para el punto 9. 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.DNI = DNI;
	}
	
	
	//Metodos Setters para los dos atributos de la clase.
	public void ponerNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	
	public void ponerApellido(String apellido) 
	{
		this.apellido = apellido;
	}

	//Metodo getter para obtener las dos propiedades. 2da parte del punto 3.
	public String obtenerNombreCompleto() 
	{
		return nombre + " " + apellido;
	}
	
	//Setter para el domicilio Punto 5B)
	public void setDomicilio(Domicilio domicilio) 
	{
		this.domicilio = domicilio;
	}
	
	public void setPareja(Persona pareja) 
	{
		this.pareja = pareja;
	}
	
	//PUNTO 5C)
	//Metodo para mostrar el domicilio en caso de que lo tenga. Manejamos el caso en que no lo tenga.
	public void mostrarDomicilio() 
	{
		if(domicilio == null) //Si no tiene domicilio
		{
			System.out.println("La persona no tiene domicilio."); //lo informamos.
		}
		else //Si tiene 
		{
			System.out.println(domicilio); // lo mostramos.
		}
		
	}
	
	public void setDNI(int dni) 
	{
		this.DNI = dni;
	}
	
	public int getDni () 
	{
		return DNI;
	}
	
	//Metodos del punto 7 que simulan trabajar y descansar.
	public void trabajar() 
	{
		System.out.println("Trabajando..");
	}
	
	public void descansar() 
	{
		System.out.println("Descansando..");
	}
	
	
	
	@Override
    public String toString() 
	{
        return  nombre + " " +  apellido + " " + domicilio + " " + DNI + " " + computadora + " " + pareja;
    }
	
	
	
}
