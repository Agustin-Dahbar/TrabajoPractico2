package Punto9;
import Punto2.Persona;
import Punto4.Test;
import Punto5.Domicilio;


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
		
		//Asignamos que son parejas acá porque en el primero creado no se le puede asignar ya que la otra persona aún no existe. Eliminamos ese atributo del constructor y simplemente lo añadimos con setters.

		
		//Creamos las cuentas bancarias de cada uno de ellos. La consigna principal del ejercicio.
		CuentaBancaria cuentaBancariaFulano = new CuentaBancaria("10-12345678-8",TipoCuenta.CAJA_AHORRO, fulano);
		CuentaBancaria cuentaBancariaMengana = new CuentaBancaria("10-9123456", TipoCuenta.CUENTA_CORRIENTE, mengana);
		
		System.out.println(cuentaBancariaFulano);
		System.out.println(cuentaBancariaMengana);
	}
}
