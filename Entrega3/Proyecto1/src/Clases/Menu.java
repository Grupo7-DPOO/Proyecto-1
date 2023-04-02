package Clases;

import java.util.HashMap;

public class Menu extends Servicios{
	
	private String nombre_de_plato;
	private boolean disponibilidad;
	private String bebida;
	private int precios;
	

	public String getNombre_de_plato() {
		return nombre_de_plato;
	}

	public void setNombre_de_plato(String nombre_de_plato) {
		this.nombre_de_plato = nombre_de_plato;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public int getPrecios() {
		return precios;
	}

	public void setPrecios(int precios) {
		this.precios = precios;
	}
	
	
}
