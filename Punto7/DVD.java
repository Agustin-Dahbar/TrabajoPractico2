package Punto7;

public class DVD 
{
	private String marca;
	
	//Metodo que evalua di el dvd puede grabar o no. Solo lo podrá hacer si su marca es "Sony".
	public boolean capazDeGrabar()
	{
		if(marca.equals("Sony")) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
