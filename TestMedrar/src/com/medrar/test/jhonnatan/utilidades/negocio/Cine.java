package com.medrar.test.jhonnatan.utilidades.negocio;

/**
 * Esta clase representa el obejto Cine con sus metodos y atributos
 * 
 * @author Jhonnatan Orozco Duque
 *
 */
public class Cine {

	private Asiento asientos[][];
	private double precio;
	private Pelicula pelicula;

	public Cine(int filas, int columnas, double precio, Pelicula pelicula) {

		asientos = new Asiento[filas][columnas];
		this.precio = precio;
		this.pelicula = pelicula;
		poblarSillas();
	}

	public Asiento[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[][] asientos) {
		this.asientos = asientos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	/**
	 * Metodo encargado de poblar nuestros asientos, dandoles una fila y una letra
	 */
	private void poblarSillas() {

		int fila = asientos.length;
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[0].length; j++) {
				asientos[i][j] = new Asiento((char) ('A' + j), fila);
			}
			fila--;
		}

	}

	/**
	 * Metodo para indicar si hay sitio en el cine
	 *
	 * @return
	 */
	public boolean haySitio() {

		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[0].length; j++) {

				if (!asientos[i][j].ocupado()) {
					return true;
				}

			}
		}

		return false;
	}

	/**
	 * Metodo para indicar si en una posicion concreta esta ocupada
	 *
	 * @param fila
	 * @param letra
	 * @return verdadero o falso
	 */
	public boolean haySitioSilla(int fila, char letra) {
		return getAsiento(fila, letra).ocupado();
	}

	/**
	 * MEtodo para indicar si el espectador cumple con los requisitos para vel la la
	 * pelicula: dinero y edad
	 *
	 * @param espectador
	 * @return
	 */
	public boolean sePuedeSentar(Espectador espectador) {
		return espectador.tieneDinero(precio) && espectador.tieneEdad(pelicula.getEdadMinima());
	}

	/**
	 * Metodo para asignar silla al espectador
	 *
	 * @param fila
	 * @param letra
	 * @param eespectador
	 */
	public void sentar(int fila, char letra, Espectador espectador) {
		getAsiento(fila, letra).setEspectador(espectador);
	}

	/**
	 * Metodo para obtener un asiento especifico por su fila y letra
	 *
	 * @param fila
	 * @param letra
	 * @return Asiento
	 */
	public Asiento getAsiento(int fila, char letra) {
		return asientos[asientos.length - fila - 1][letra - 'A'];
	}

	/**
	 * Obtiene número de filas del cine
	 *
	 * @return
	 */
	public int getFilas() {
		return asientos.length;
	}

	/**
	 * Obtiene número de columas del cine
	 *
	 * @return
	 */
	public int getColumnas() {
		return asientos[0].length;
	}

	/**
	 * Metodo para mostrar los datos de nuestro cine
	 */
	public void mostrarDatosSalaCine() {

		System.out.println("\nInformación Sala de cine");
		System.out.println("Pelicula en Función: " + pelicula);
		System.out.println("Precio entrada: " + precio);
		System.out.println("");
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[0].length; j++) {
				System.out.println(asientos[i][j]);
			}
			System.out.println("");
		}
	}

}