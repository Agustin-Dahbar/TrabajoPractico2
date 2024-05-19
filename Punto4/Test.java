package Punto4;

import Punto2.Persona;
import Punto6.Dado;
import Punto8.TarjetaDeCredito;
import Punto9.CuentaBancaria;
import Punto9.TipoCuenta;
import Punto5.Domicilio;

public class Test 
{
	public static void main(String[] args) 
	{
		Persona persona = new Persona(); //Instanciamos una persona.
		
		//Le asignamos valores a sus dos atributos mediante los metodos setters.
		persona.ponerNombre("Fulano"); 
		persona.ponerApellido("Gomez");
		persona.setDNI(12345678);
		
		//Devolvemos los valores de sus dos atributos via el metodo que los concatena y devuelve juntos.
		System.out.println(persona.obtenerNombreCompleto());
		
		
		//Segunda parte del punto 4. Rehacer lo mismo con otra persona.
		Persona yo = new Persona();
		
		yo.ponerNombre("Agustin");
		yo.ponerApellido("Dahbar");
		
		System.out.println(yo.obtenerNombreCompleto());
		
		
		//Punto 5D) //Creamos un nuevo domicilio.
		Domicilio domicilioDeFulano = new Domicilio();
		domicilioDeFulano.setCalle("Calle");
		domicilioDeFulano.setNumero(2020);
		domicilioDeFulano.setCiudad("Mar del Plata");
		
		persona.setDomicilio(domicilioDeFulano); //Se lo asignamos a Fulano.
		
		//Punto 5E)
		yo.setDomicilio(domicilioDeFulano); //Se lo asignamos a Agustin.
		
		//Punto 5F)
		domicilioDeFulano.setCiudad("New York");
		
		//Punto 5G Devolvemos los datos de las personas. En su println() no se muestra el domicilio por eso lo mostramos en otra línea con su metodo correspondiente.
		System.out.println(persona); 
		persona.mostrarDomicilio(); 
		
		System.out.println(yo);
		yo.mostrarDomicilio();
		
		
		//Separación de puntos.
		System.out.println("");
		
		
		
		
		//Punto 6 Segunda parte.
		System.out.println("Comenzamos punto 6 tema Dados.");
		
		Dado dado = new Dado(4); //Usamos constructor parametrizado y le asignamos el valor de 6.
		Dado dadoDos = new Dado(4); //Usamos el constructor por defecto que le asignaba el valor de 1.
		
		System.out.println(dado);
		System.out.println(dadoDos);
		
		//Evaluamos si los datos valen lo mismo o !=.
		if(dado == dadoDos) 
		{
			System.out.println("Los dados tienen el mismo valor. Este es " + dado);
		}
		else 
		{
			System.out.println("Los dados tienen diferentes valores.");
			
			//Ahora evaluamos cual es el mayor.
			if(dado.getValor() > dadoDos.getValor()) //Sin los metodos de getValor() me daba error.
			{
				System.out.println(dado + " es el mayor valor");
			}
			else //Ya que ya evaluamos 2 de los 3 casos en el anterior if y else, solo nos queda una posibilidad.
			{
				System.out.println(dadoDos + " es el mayor");
			}
		}
				
		
		System.out.println("Creamos un dado, lo lanzamos 100 veces y sumamos sus 100 valores para obtener su promedio.");
		
		//Ultimo ejercicio del punto 6. Mostrar el promedio de 100 lanzamientos.
		//Creamos las variables necesarias.
		Dado tercerDado = new Dado(); //Dado a lanzar 100 veces.
		int sumaDeValores = 0;
		double promedio = 0;
		
		//Bucle for que realiza 100 lanzamientos de dado y suma sus valores devueltos en cada iteración.
		for(int i = 0; i < 100; i++) 
		{
			int valor = tercerDado.Lanzar(); //Obtenemos el valor del lanzamiento de dado.
			sumaDeValores += valor; //Sumamos el valor al acumulador que nos servirá para al final obtener el promedio al dividirlo por los 100 lanzamientos.
		}
		
		//Una vez realizadas las 100 iteraciones y obtenida la suma de todos los valores, realizamos el promedio y lo imprimimos.
		promedio = sumaDeValores/100.0;
		System.out.println("El promedio de los 100 lanzamientos de dados es " + promedio);
		
		
		//Separación de puntos
		System.out.println("");
		
		
		//Punto 8 Parte 2
		TarjetaDeCredito tarjeta = new TarjetaDeCredito("Número 4145-4141-2222-1111", "Juan Perez", 10000);
		
		//Realizamos una compra con un monto de 4000. Ya que el limite es 10000, se podrá llevar a cabo.
		double montoCompra = 4000; //A partir de 10001 nos ejecutaría el else, ya que se nos devolvería false por ser mayor al límite.
		
		//Evaluamos si con el monto podemos realizar la compra, en caso de que si acumulamos este valor al gasto actual. SI no podemos lo indicaremos.
		if(tarjeta.realizarCompra(montoCompra))  //Retorna true. Es decir que la condición es true. Por lo tanto se ejecuta el bloque de código siguiente.
		{
			System.out.println("Compra realizada por $ " + montoCompra);
			//Restarle el montoCompra al montoDisponible para que responda bien la 134.
		}
		else 
		{
			System.out.println("No se puede realizar la compra ya que el monto supera al límite.");
		}
		
		//Una vez realizada la evaluación indicamos cuanto gasto disponible nos queda.
        System.out.println("El monto disponible actual es de " + tarjeta.montoDisponible());
		
        
        
        //Actualizamos el límite a 3000.
        tarjeta.actualizarLimite(3000);
        
        
        //Reintentamos otra compra con 4000 y esta vez debería ejecutarse el else.
        double segundoMontoCompra = 4000;
        
        if(tarjeta.realizarCompra(segundoMontoCompra)) 
        {
        	System.out.println("Compra realizada por $ " + segundoMontoCompra);
        }
        else 
        {
        	System.out.println("No se puede realizar la compra, el monto es mayor al límite.");
        }
        
        
        System.out.println("El monto disponible actual es de " + tarjeta.montoDisponible());
        
        
        //Separación de puntos
        System.out.println("");
        
        //PUNTO 9: Comprobamos que funcionan los metodos de la nueva clase. Le depositamos 10k, le restamos 3k y en consola vemos como nos quedan 7k de saldo.
        CuentaBancaria cuenta = new CuentaBancaria("first cuentaBancaria", TipoCuenta.CAJA_AHORRO , persona);
        cuenta.depositar(10000);
        cuenta.extraer(3000);
        cuenta.obtenerSaldo();
        
        
        
        //Luego de creada ya la cuenta bancaria con el CBU lo devolvemos con su metodo.
        cuenta.generarCBU();
        
        
        
        
        
        
	}
}
