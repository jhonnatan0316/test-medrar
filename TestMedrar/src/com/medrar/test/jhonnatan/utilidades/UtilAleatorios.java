package com.medrar.test.jhonnatan.utilidades;

import java.util.Random;

/**
 * Clase con informacion que es reultilizada
 * 
 * @author Jhonnatan Orozco Duque
 *
 */
public class UtilAleatorios {

	public static final String nombres[] = { "Ian", "Jhonnatan", "Betsy", "Andres", "Perla", "Julio", "Martin",
			"Ismael", "Daniel", "Francisco", "Raul", "Julian", "Andrea", "Fabio", "Laura" };

	public static final String nombresPeliculas[] = { "La mascara", "Rapido y furioso", "Obilion", "Scary movie",
			"La Perla", "Super campeones", "Sing", "wally" };

	/**
	 * Metodo para generar números aleatorios entre rangos para ejercicios de
	 * recursividad
	 * 
	 * @param inicio rango inicial
	 * @param fin    rango final
	 * @return int numero aleatorio generado
	 */
	public static int GenerarNumeroAleatorio(int inicio, int fin) {

		Random aleatorio = new Random();

		int numeroAleatorio = inicio + aleatorio.nextInt(fin);

		return numeroAleatorio;
	}

	/**
	 * Metodo para generar un entero aleatorio para el cine
	 * 
	 * @param minimo
	 * @param maximo
	 * @return valor generado
	 */
	public static int generaNumeroEnteroAleatorio(int minimo, int maximo) {
		int num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}

	/**
	 * Metodo para generar un Double aleatorio para el cine
	 * 
	 * @param minimo
	 * @param maximo
	 * @return valor generado
	 */
	public static double generaNumeroRealAleatorio(int minimo, int maximo) {
		double num = (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
		return num;
	}

	/**
	 * Metodo para poblar un arreglo con números aleatorios
	 * 
	 * @param inicio rango inicial
	 * @param fin    rango final
	 * @param tamaño arreglo
	 * @return un arreglo de enteros
	 */
	public static int[] generarArrayAleatorio(int inicio, int fin) {
		int[] numerosArray = new int[NumeroConstants.NUMERO_DOCE];
		Random aleatorio = new Random();
		for (int i = 0; i < numerosArray.length; i++) {
			numerosArray[i] = inicio + aleatorio.nextInt(fin);
		}
		return numerosArray;
	}

}
