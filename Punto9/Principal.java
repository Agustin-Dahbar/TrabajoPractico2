package Punto9;
import Punto2.Persona;
import Punto4.Test;
import Punto5.Domicilio;
import Punto10.Robot;

public class Principal 
{
	public static void main(String[] args) 
	{	
		//Hay que modificar el 10, no se a que se refirió el profe cuando dijó " valor ordinal del tipo de cuenta " sumarle eso al 10 que figura en ambos casos.
	
		//Punto 9
		Domicilio domicilioYatay = new Domicilio("Yatay", 240, "Almagro");
		Persona fulano = new Persona("Fulano", "Gomez", domicilioYatay, 12345678);
		
		//Ahora su novia
		Persona mengana = new Persona("Mengana", "Torres", domicilioYatay, 9123456);
		
		//No asignamos que son pareja porque me generaba error en la consola.
		
		//Creamos las cuentas bancarias de cada uno de ellos. La consigna principal del ejercicio.
		CuentaBancaria cuentaBancariaFulano = new CuentaBancaria("10-12345678-8",TipoCuenta.CAJA_AHORRO, fulano);
		CuentaBancaria cuentaBancariaMengana = new CuentaBancaria("10-9123456", TipoCuenta.CUENTA_CORRIENTE, mengana);
		
		System.out.println(cuentaBancariaFulano);
		System.out.println(cuentaBancariaMengana);
		
		
		
		//PUNTO 10 ROBOT
		Robot robot = new Robot("Wall-e");
		
		robot.saludar();
		robot.saludar(fulano);
		//Efectivamente los metodos funcionan.
		
	}
}
