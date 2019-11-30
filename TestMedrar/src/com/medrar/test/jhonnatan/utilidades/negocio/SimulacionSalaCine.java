package com.medrar.test.jhonnatan.utilidades.negocio;

import com.medrar.test.jhonnatan.utilidades.NumeroConstants;
import com.medrar.test.jhonnatan.utilidades.UtilAleatorios;

/**
 * Clase con la logica de negocio para realizar la simulacion de la sala de cine
 * 
 * @author Jhonnatan Orozco Duque
 *
 */
public class SimulacionSalaCine {

	public static void simularSalaCine() {

		// Se crea la instancia de la pelicula que esta en función en la sala de cine
		Pelicula pelicula = new Pelicula(
				UtilAleatorios.nombresPeliculas[UtilAleatorios.GenerarNumeroAleatorio(0,
						UtilAleatorios.nombresPeliculas.length - 1)],
				UtilAleatorios.generaNumeroEnteroAleatorio(NumeroConstants.NUMERO_NOVENTA,
						NumeroConstants.NUMERO_CIENTO_OCHENTA),
				UtilAleatorios.generaNumeroEnteroAleatorio(NumeroConstants.NUMERO_TRES, NumeroConstants.NUMERO_DIECIOCHO),
				UtilAleatorios.nombres[UtilAleatorios.GenerarNumeroAleatorio(0, UtilAleatorios.nombres.length - 1)]);
		System.out.println(pelicula);

		int filas = NumeroConstants.NUMERO_OCHO;
		int columnas = NumeroConstants.NUMERO_NUEVE;

		double precio = UtilAleatorios.generaNumeroEnteroAleatorio(NumeroConstants.NUMERO_UNO, NumeroConstants.NUMERO_DOCE);
		System.out.println("El precio para la función del día de hoy es: " + precio + " Euros ");

		//Se crea la instancia del Cine 
		Cine cine = new Cine(filas, columnas, precio, pelicula);

		int numEspectadores = UtilAleatorios.generaNumeroEnteroAleatorio(NumeroConstants.NUMERO_NOVENTA,
				NumeroConstants.NUMERO_CIENTO_OCHENTA);
		System.out.println("Se van a crear para la simulación con: " + numEspectadores + " espectadores ");

		Espectador espectador;
		int fila;
		char letra;

		System.out.println("\nInicia proceso de espectadores generados: ");
		// Finaliza cuando no queden espectadores o no se tenga mas sitio en el cine disponible
		for (int i = 0; i < numEspectadores && cine.haySitio(); i++) {

			// Se crea la instancia del Especador que desea entrar a la función
			espectador = new Espectador(
					UtilAleatorios.nombres[UtilAleatorios.GenerarNumeroAleatorio(0, UtilAleatorios.nombres.length - 1)],
					UtilAleatorios.generaNumeroEnteroAleatorio(NumeroConstants.NUMERO_TRES, NumeroConstants.NUMERO_NOVENTA),
					UtilAleatorios.generaNumeroRealAleatorio(NumeroConstants.NUMERO_UNO, NumeroConstants.NUMERO_DIEZ));

			System.out.println("\n" + espectador.toString());

			//Se genera una silla con su respectiva letra
			do {
				
				fila = UtilAleatorios.generaNumeroEnteroAleatorio(0, cine.getFilas() - 1);
				letra = (char) UtilAleatorios.generaNumeroEnteroAleatorio('A', 'A' + (cine.getColumnas() - 1));

			} while (cine.haySitioSilla(fila, letra));

			// Valida si el espectador cumple con las condiciones
			if (cine.sePuedeSentar(espectador)) {
				espectador.pagar(cine.getPrecio());
				cine.sentar(fila, letra, espectador);
				System.out.println("El espectador cumple los requisitos para poder ingresar a la pelicula");

			} else {
				System.out.println(
						"Lo sentimos el espectador no cumple los requisitos para poder ingresar a la pelicula");
			}

		}

		cine.mostrarDatosSalaCine();

		System.out.println("Final de la simulación");
	}

}
