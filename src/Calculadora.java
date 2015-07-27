/*Universidad del Valle de Guatemala
 *Algoritmos y Estructuras de Datos
 *Secci�n 30
 *Guillermo Javier de Le�n Archila, 14022
 *Jos� Pablo Ortega Grajeda, 14565
 *Dan Isa� Alvarez Ruano, 14628
 *Interfaz: Calculadora
 */

public interface Calculadora {
	
	/**
	 * Proposito: Colocar el String dentro de un atributo
	 * @param linea
	 */
	public void setString(String linea);
	
	/**
	 * Proposito: Colocar el String en un vector
	 */
	public void meterVector();
	
	/**
	 * Proposito: Calcular el resultado en base al vector. Validar la entrada correcta de datos
	 * @return false -> error de entrada true -> entrada correcta
	 */
	public boolean calcularVector();
	
	/**
	 * Proposito: Obtener el resultado de la operacion
	 * @return resultado
	 */
	public int getResultado();
}
