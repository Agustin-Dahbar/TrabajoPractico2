package Punto4;

import Punto2.Persona;
import Punto5.Domicilio;
import Punto6.Dado;

public class Test 
{
	public static void main(String[] args) 
	{
		Persona persona = new Persona(); //Instanciamos una persona.
		
		//Le asignamos valores a sus dos atributos mediante los metodos setters.
		persona.ponerNombre("Fulano"); 
		persona.ponerApellido("Gomez");
		
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
		
		
		
		System.out.println("");
		
		//Separación
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
		
	}
}
