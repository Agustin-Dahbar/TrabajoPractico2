package Punto9;
import Punto2.Persona;
import Punto4.Test;
import Punto5.Domicilio;
import Punto10.Robot;
import Punto11.Turnera;
import Punto12.Calculadora;

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
		
		
		//Punto 11. Comprobamos los 3 metodos.
		Turnera turnera = new Turnera();
		
		int valor = turnera.obtenerUltimoNumeroOtorgado();
		System.out.println("El valor es " + valor); //Dará 10.
		
		turnera.otorgarProximoNumero(); //Le sumamos una unidad al objeto. Ya que es void no podemos almacenarlo en la variable por lo tanto..
		
		valor = turnera.obtenerUltimoNumeroOtorgado(); //Retornamos el valor del atributo luego de haberle agregado uno con el metodo anterior.
		System.out.println(valor); //Dará 11.
		
		turnera.resetearContador(20); //Le damos el valor 20.
		valor = turnera.obtenerUltimoNumeroOtorgado(); //Lo devolvemos y almacenamos en una variable
		System.out.println(valor); //Dará 20.
		
		System.out.println("");
		
		//PUNTO 12. Comprobamos que todo funcione.
		System.out.println("Punto 12. Calculadora.");
		Calculadora calculadora = new Calculadora();
		
		System.out.println(calculadora.sumar(1,2));
		System.out.println(calculadora.restar(1,2));
		System.out.println(calculadora.multiplicar(1,2));
		System.out.println(calculadora.dividir(27,3));
	    System.out.println(calculadora.dividir(10,0));
	}
}
