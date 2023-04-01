package Clases;

import java.util.HashMap;

public class Habitaciones {
	
	private HashMap<Integer, Habitaciones> habitaciones;

	private int numero;
	private int tarifa;
	private String ubicacion;
	private boolean balcon;
	private String tipo;
	private boolean vista;
	private boolean cocina;
	
	public Habitaciones(int numero, int tarifa, String ubicacion, 
			boolean balcon, String tipo, boolean vista, boolean cocina) {
		this.numero = numero;
		this.tarifa = tarifa;
		this.ubicacion = ubicacion;
		this.balcon = balcon;
		this.tipo = tipo;
		this.vista = vista;
		this.cocina = cocina;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getTarifa() {
		return tarifa;
	}
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public boolean isBalcon() {
		return balcon;
	}
	public void setBalcon(boolean balcon) {
		this.balcon = balcon;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isVista() {
		return vista;
	}
	public void setVista(boolean vista) {
		this.vista = vista;
	}
	public boolean isCocina() {
		return cocina;
	}
	public void setCocina(boolean cocina) {
		this.cocina = cocina;
	}
	
	public boolean existeHabitacion(int numero) {
		return this.habitaciones.containsKey(numero);
	}
	
	public boolean crearHabitacion(int numero, int tarifa, String ubicacion, 
			boolean balcon, String tipo, boolean vista, boolean cocina) {
		if (!existeHabitacion(numero)) {
			Habitaciones habitacion = new Habitaciones(numero, tarifa, ubicacion, balcon, tipo, vista, cocina);
			this.habitaciones.put(numero, habitacion);
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return this.numero + "\t" + this.tarifa + "\t" + this.ubicacion + "\t" + this.balcon + "\t" + this.tipo+"\t" + this.vista+ "\t" + this.cocina+"\n";
	}	
}