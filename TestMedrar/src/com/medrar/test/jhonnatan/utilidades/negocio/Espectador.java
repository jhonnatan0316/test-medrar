package com.medrar.test.jhonnatan.utilidades.negocio;

/**
 * Esta clase representa el obejto Espectador con sus metodos y atributos
 * 
 * @author Jhonnatan Orozco Duque
 *
 */
public class Espectador {

	private String nombre;
	private int edad;
	private Double dineroDisponible;

	public Espectador(String nombre, int edad, Double dineroDisponible) {
		this.nombre = nombre;
		this.edad = edad;
		this.dineroDisponible = dineroDisponible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(Double dineroDisponible) {
		this.dineroDisponible = dineroDisponible;
	}

	/**
	 * Metodo para descontar la entrada al cine
	 *
	 * @param precio
	 */
	public void pagar(double precio) {
		dineroDisponible -= precio;
	}

	/**
	 * Metodo para indicar si el espectador tiene edad para ver la pelicula
	 *
	 * @param edadMinima
	 * @return boolean
	 */
	public boolean tieneEdad(int edadMinima) {
		return edad >= edadMinima;
	}

	/**
	 * Metodo para indicar si el espectador tiene dinero
	 *
	 * @param precioEntrada
	 * @return
	 */
	public boolean tieneDinero(double precioEntrada) {
		return dineroDisponible >= precioEntrada;
	}

	@Override
	public String toString() {
		return "el nombre del espectador es " + nombre + " de " + edad + " años y con " + dineroDisponible
				+ " euros en su bolsillo";
	}
}
