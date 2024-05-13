package Punto10;
import Punto2.Persona;

public class Robot 
{
	private String nombreRobot;
	
	public Robot(String nombreRobot) 
	{
		this.nombreRobot = nombreRobot;
	}
	
	public void saludar() 
	{
		System.out.println("Hola mi nombre es " + nombreRobot + " ¿En que puedo ayudarte?");
	}
	
	public void saludar(Persona persona) 
	{
		System.out.println("Hola " + persona + " mi nombre es " + nombreRobot + "¿En qué puedo ayudarte");
	}
}
