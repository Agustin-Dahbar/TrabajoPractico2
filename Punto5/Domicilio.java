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
	
	//Getters y setters de los atributos
	//Setter
	public void setCalle(String calle) 
	{
		this.calle = calle;
	}
	
	//Getter
	public String getCalle() 
	{
		return calle;
	}
	
	public void setNumero(int numero) 
	{
		this.numero = numero;
	}
	
	public int getNumero() 
	{
		return numero;
	}
	
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
