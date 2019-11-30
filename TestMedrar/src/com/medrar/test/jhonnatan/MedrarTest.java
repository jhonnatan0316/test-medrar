package com.medrar.test.jhonnatan;

import com.medrar.test.jhonnatan.utilidades.NumeroConstants;
import com.medrar.test.jhonnatan.utilidades.UtilAleatorios;
import com.medrar.test.jhonnatan.utilidades.negocio.EjeciciosRecursividad;
import com.medrar.test.jhonnatan.utilidades.negocio.SimulacionSalaCine;

public class MedrarTest {

	public static void main(String[] args) {
		
		//Inicio Problemas practicos Primera parte, Recursividad
		
		// Se genera el arreglo aleatorio de 12 posiciones
		System.out.println("1. Encontrar el número mayor en un arreglo de 12 posiciones llenado de manera aleatoria");
		int[] numerosAleatorios = UtilAleatorios.generarArrayAleatorio(NumeroConstants.NUMERO_UNO, NumeroConstants.NUMERO_FIN_6_DIGITOS);
		String arregloGenerado = "";

		for (int i = 0; i < numerosAleatorios.length; i++) {
			// Guardo los valores del arreglo en un String
			arregloGenerado += numerosAleatorios[i] + " ";
		}
		StringBuilder sbuilder = new StringBuilder();
		System.out.println("El arreglo que se genero de manera aleatoria es:"
				+ sbuilder.append("[ ").append(arregloGenerado).append("]"));
		
		System.out.println("El número mayor del arreglo es: " + EjeciciosRecursividad.calcularMaximoVAlorArray(numerosAleatorios, NumeroConstants.NUMERO_CERO));


		System.out.println("\n2. Sumar los dígitos de un número de 6 caracteres dado de forma aleatoria");
		// Se genera el número aleatorio entre 1 y 10
		int numAleatorioSum = UtilAleatorios.GenerarNumeroAleatorio(NumeroConstants.NUMERO_INI_6_DIGITOS,
				NumeroConstants.NUMERO_FIN_6_DIGITOS);
		System.out.println("El número que se genero de manera aleatoria es: " + numAleatorioSum);
		System.out.println("La suma de sus digitos es: " + EjeciciosRecursividad.calcularSumarDigitos(numAleatorioSum));

		System.out.println("\n3. Encontrar el factorial de un número entre 1 y 10 dado de manera aleatoria");
		// Se genera el número aleatorio de 6 digitos
		int numAleatorioFac = UtilAleatorios.GenerarNumeroAleatorio(NumeroConstants.NUMERO_UNO,
				NumeroConstants.NUMERO_DIEZ);
		System.out.println("El número que se genero de manera aleatoria es: " + numAleatorioFac);
		System.out.println("Su respectivo factorial es: " + EjeciciosRecursividad.calcularFactorial(numAleatorioFac));

		//Fin Problemas practicos Primera parte, Recursividad
		
		//Inicio problema practico simulación sala de cine
		System.out.println("\n Inicia simulacion de la sala de cine ");
		SimulacionSalaCine.simularSalaCine();
		//Fin problema practico simulación sala de cine
	}


}
