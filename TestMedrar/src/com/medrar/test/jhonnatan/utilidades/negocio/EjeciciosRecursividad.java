package com.medrar.test.jhonnatan.utilidades.negocio;

/**
 * Clase con la logica de negocio para realizar los calculos solicitados
 * 
 * @author Jhonnatan Orozco Duque
 *
 */
public class EjeciciosRecursividad {

	/**
	 * MEtodo para calcular el valor mayor en un arreglo de enteros
	 * 
	 * @param arregloNumeros
	 * @param indice
	 * @return valor mayor del arreglo
	 */
	public static int calcularMaximoVAlorArray(int[] arregloNumeros, int indice) {

		int maximo = Integer.MIN_VALUE;
		if (indice != arregloNumeros.length) {

			maximo = Math.max(arregloNumeros[indice], calcularMaximoVAlorArray(arregloNumeros, indice + 1));
		}

		return maximo;

	}

	/**
	 * Metodo para calucular la suma de los digitos de un número
	 * 
	 * @param numero
	 * @return valor de la suma
	 */
	public static int calcularSumarDigitos(int numero) {

		if (numero < 10) {
			return numero;
		}

		return (numero % 10) + calcularSumarDigitos(numero / 10);

	}

	/**
	 * Metodo encargado de calcular el factorial de un número
	 * 
	 * @param numero para el calculo
	 * @return int con el factorial del número
	 */
	public static int calcularFactorial(int numero) {

		if (numero == 0) {
			return 1;
		}

		return numero * calcularFactorial(numero - 1);
	}

}
