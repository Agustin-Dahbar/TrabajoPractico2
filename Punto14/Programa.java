package Punto14;
import java.util.Scanner;

public class Programa 
{
	public static void main(String[] args) 
	{
		//Instanciamos todas las clases necesarias para ejecutar el programa pedido.
		Scanner scanner = new Scanner(System.in);
		Acumulador acumulador = new Acumulador();
		Contador contador = new Contador();
		Promedio promedio = new Promedio(acumulador, contador);
		
		System.out.println("Ingrese las notas del primer parcial (-1 para finalizar):");

        int nota = 0;
        
        do {
            System.out.print("Nota: ");
            nota = scanner.nextInt(); //Si le damos -1 ninguno de los dos siguientes casos se cumplen. Por lo tanto no sucede nada y no se repite el bucle while, se va a la línea 31.

            if (nota >= 0 && nota <= 10) //Si esta entre 0 y 10.
            {
                promedio.incrementar(nota); //Con este metodo le damos valores a los atributos de la clase Promedio.
                //Contador siempre tendrá el valor uno y acumulador el que se haya ingresado en la entrada "nota".
            } 
            else if (nota != -1) //Si nota no esta entre 0 y 10 y tampoco es -1. Es inválida y pedimos su reingreso. 
            {
                System.out.println("Nota inválida. Debe estar entre 0 y 10."); //Si no esta entre 0 y 10 y no es -1. 
                //La nota ingresada es incorrecta. Al evaluarse el siguiente while se repetirá la ejecución ya que el ingreso fue != a -1.
            }

        } while (nota != -1); //Si se ingresa -1 Se continúa con la línea 37.

        double promedioFinal = promedio.obtenerValor(); //Obtenemos el valor del promedio entre la división del acumulador y el contador.
        System.out.println("El promedio del primer parcial es: " + promedioFinal);

        scanner.close(); // Cerramos el scanner al finalizar
		
        //El acumulador solo se suma cuando se llama al metodo incrementar() es por eso que al cortar el programa con -1 no se suma al divisor
        //y se usa el correcto. (solo se acumula el divisor al ingresar entre 0 y 10).
	}
}
