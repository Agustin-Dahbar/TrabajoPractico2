package Punto1;

import java.util.Scanner;

public class Ejercicio1 {
	
	
	//Metodo que suma dos int´s.
		public int sumar(int a, int b) 
		{
			return a + b;
		}
		
		//Metodo que pide un número entre dos, antes imprime una cadena.
		public int pedirNumero(String texto, int minimo, int maximo) 
		{
			Scanner scanner = new Scanner(System.in); //Creamos scanner para entrada del numero.
			
			System.out.println(texto); //Imprimimos la instrucción.
			int numero = scanner.nextInt(); //Le pedimos el numero
			
			while(!(numero > minimo && numero < maximo)) //Validamos que este entre los 2 números que le indicamos. 
			{
				System.out.println("Error. Dije entre " + minimo + " y " + maximo);
				numero = scanner.nextInt(); 
			}
			
			return numero; //Una vez se ingrese un número correcto, lo devolvemos.
		}
		
		
		//Metodo Main
		public static void main(String[] args) 
		{
			Scanner scanner = new Scanner(System.in);
			Ejercicio1 operaciones = new Ejercicio1(); //Instanciamos la clase operaciones para poder usar el metodo deseado (pedirNumero)
			
			//Metodo en el que pedimos un número entre dos indicados.
			int numero = operaciones.pedirNumero("Ingresa un numero entre 5 y 7", 5, 7); //Se llama al metodo con dichos argumentos, hasta que el usuario no ingrese el número 6 no se ejecutará la siguiente línea del main.
			System.out.println("El número ingresado es " + numero);
			
			System.out.println(""); //Espacio entre los dos metodos
			
			//Ahora el metodo de la suma.
			System.out.println("Ingresa dos numeros, los sumare.");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.println("=");
			System.out.println(operaciones.sumar(num1, num2));
		}
		


}
