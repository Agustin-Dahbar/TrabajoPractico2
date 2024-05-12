package Punto5;

public class Domicilio 
{
	//Atributos privados
	private String calle;
	private int numero;
	private String ciudad;
	
	//Constructor
	public Domicilio() 
	{
		calle = "";
		numero = 0;
		ciudad = "";
	}
	
	//Constructor para el punto 9
	public Domicilio(String calle, int numero, String ciudad) 
	{
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
	}
	
	//Getters y setters de los atributos
	//Calle
	public void setCalle(String calle) 
	{
		this.calle = calle;
	}
	
	public String getCalle() 
	{
		return calle;
	}
	
	//Numero
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
	public int getNumero() 
	{
		return numero;
	}
	
	
	//Ciudad
	public void setCiudad(String ciudad) 
	{
		this.ciudad = ciudad;
	}
	
	public String getCiudad() 
	{
		return ciudad;
	}
	
	
	@Override
    public String toString() 
	{
        return  calle + " " +  numero + " " + ciudad;
    }
}
