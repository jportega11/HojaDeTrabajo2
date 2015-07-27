/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Sección 30
 *Guillermo Javier de León Archila, 14022
 *José Pablo Ortega Grajeda, 14565
 *Dan Isaí Alvarez Ruano, 14628
 *Interfaz: Driver
 */

import java.util.Scanner;
import java.io.*;

public class Driver{

	public static void main (String[] args){
		String contenido = ""; //contendra el texto del archivo
		Calculadora calcu = new CalculadoraHDT2();
		try{
			contenido = ""; //guarda el contenido del documento
			Scanner s = new Scanner(new File("datos.txt")).useDelimiter("\\s"); //se crea el objeto Scanner que lee datos
			contenido = s.nextLine(); //lee
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Operación ingresada: " + contenido);
		calcu.setString(contenido);
		calcu.meterVector();
		if(calcu.calcularVector() == false){
			System.out.println("Entrada incorrecta de datos");
		}
		else{
			System.out.println("Respuesta: " + calcu.getResultado());
		}
	}
}