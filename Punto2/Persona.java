package Punto2;

import Punto5.Domicilio; //Punto 5B)

public class Persona 
{
	
	private String nombre;
	private String apellido;
	private Domicilio domicilio;//Punto 5B) 

	//Punto 3 Crear constructor y metodo obtenerNombreCompleto() (líneas 13 y 31)	
	public Persona() 
	{
		this.nombre = "";
		this.apellido = "";
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
	
	
	@Override
    public String toString() 
	{
        return  nombre + " " +  apellido;
    }
	
	
	
}
