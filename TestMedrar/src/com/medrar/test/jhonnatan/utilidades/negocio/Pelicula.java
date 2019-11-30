package com.medrar.test.jhonnatan.utilidades.negocio;

/**
 * Esta clase representa el obejto Pelicula con sus metodos y atributos
 * 
 * @author Jhonnatan Orozco Duque
 *
 */
public class Pelicula {
	
	private String titulo;
	private int minutosDuracion;
	private int edadMinima;
	private String director;
	
	public Pelicula(String titulo, int minutosDuracion, int edadMinima, String director) {
		super();
		this.titulo = titulo;
		this.minutosDuracion = minutosDuracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getMinutosDuracion() {
		return minutosDuracion;
	}

	public void setMinutosDuracion(int minutosDuracion) {
		this.minutosDuracion = minutosDuracion;
	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	@Override
    public String toString() {
        return "Pelicula del día: " + titulo + " del director " + director + ", con una duracion de " + minutosDuracion + " minutos y la edad minima es de " + edadMinima + " años";
    }

}
