package Punto9;
import Punto2.Persona;
import Punto5.Domicilio;


public class Principal 
{
	public static void main(String[] args) 
	{
		
		Domicilio domicilioYatay = new Domicilio("Yatay", 240, "Almagro");
		Persona fulano = new Persona("Fulano", "Gomez", domicilioYatay, 12345678);
		Persona mengana = new Persona("Mengana", "Torres", domicilioYatay, 9123456);
		
		CuentaBancaria cuentaBancariaFulano = new CuentaBancaria("10-12345678-8", TipoCuenta.CAJA_AHORRO, fulano);
		CuentaBancaria cuentaBancariaMengana = new CuentaBancaria("10-9123456-6", TipoCuenta.CUENTA_CORRIENTE, mengana);
		//Hay que modificar el 10, no se a que se refirió el profe cuando dijó " valor ordinal del tipo de cuenta " sumarle eso al 10 que figura en ambos casos.
	
		System.out.println(fulano);
		System.out.println(cuentaBancariaFulano);
		
		//ME FALTA AGREGAR MEDIANTE EL SETTER QUE SON NOVIOS, ESTO PROVOCÓ UN ERROR EN LA CONSOLA. NECESITO CORREGIRLO.
	}
}
