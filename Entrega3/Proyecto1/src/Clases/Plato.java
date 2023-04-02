package Clases;

import java.util.HashMap;

public class Plato {
	private HashMap<Integer, Plato> platos;
	private int id;
	private String ingredientes;
	private int cantidad_ingredientes;
	private String nombre;

	
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public int getCantidad_ingredientes() {
		return cantidad_ingredientes;
	}
	public void setCantidad_ingredientes(int cantidad_ingredientes) {
		this.cantidad_ingredientes = cantidad_ingredientes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public HashMap<Integer, Plato> getPlatos() {
		return platos;
	}
	public void setPlatos(HashMap<Integer, Plato> platos) {
		this.platos = platos;
	}
	public Plato(int id, String ingredientes, String nombre, int cantidad_ingredientes) {
	this.id = id;
	this.cantidad_ingredientes = cantidad_ingredientes;
	this.ingredientes = ingredientes;
	this.nombre = nombre;
	}
	
	public boolean existePlato(Integer id) {
		return this.platos.containsKey(id);
	}
	
	public boolean crearPlato(int id, String nombre, String ingredientes, int cantidad_ingredientes) {
		if(!existePlato(id)) {
			Plato plato = new Plato(id, nombre, ingredientes, cantidad_ingredientes);
			this.platos.put(id, plato);
			return true;
		}else {
			return false;
		}
	}
	
	public String consultarPlatos() {
		String resultado = "id\tNombre\tP. C.\tP. V.\tUnidades\n";
		for(Integer id : this.platos.keySet()) {
			resultado += this.platos.get(id);
		}
		return resultado;
	}
				
	public String editarPlato(int id, String nombre, String ingredientes, int cantidad_ingredientes) {
		if(existePlato(id)) {
			Plato actualizadoPlato = new Plato (id, nombre, ingredientes, cantidad_ingredientes);
			platos.put(id, actualizadoPlato);
			return ("Plato editado");
		}else {
			return ("Plato no hay un plato valido para editar");
		}
		
	}
}
