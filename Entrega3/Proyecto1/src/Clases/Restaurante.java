package Clases;
import java.util.HashMap;

public class Restaurante extends Servicios{

	private HashMap<String, Menu2> menus;
	private HashMap<Integer, Plato2> platos;

	public Restaurante() {
		this.menus = new HashMap<String, Menu2>();
		this.platos = new HashMap<Integer, Plato2>();
	}
	
	public boolean existePlato(Integer id) {
		return this.platos.containsKey(id);
	}
	
	public Plato2 getPlato(int id) {
		return this.platos.get(id);
	}
	
	public boolean crearPlato(int id, String nombre, String ingredientes, int cantidad_ingredientes) {
		if(!existePlato(id)) {
			Plato2 plato = new Plato2(id, nombre, ingredientes, cantidad_ingredientes);
			this.platos.put(id, plato);
			return true;
		}else {
			return false;
		}
	}
	
	public String consultarPlatos() {
		String resultado = "id\tnombre\tingredientes\tcantidad_ingredientes\n";
		for(Integer id : this.platos.keySet()) {
			resultado += this.platos.get(id);
		}
		return resultado;
	}
				
	public String editarPlato(int id, String nombre, String ingredientes, int cantidad_ingredientes) {
		if(existePlato(id)) {
			Plato2 actualizadoPlato = new Plato2 (id, nombre, ingredientes, cantidad_ingredientes);
			platos.put(id, actualizadoPlato);
			return ("Plato editado");
		}else {
			return ("no hay un plato valido para editar");
		}
		
	}

	public boolean existeMenu(String nombre_de_plato) {
		return this.menus.containsKey(nombre_de_plato);
	}
	
    public Menu2 getMenu(String nombre_de_plato) {
        return this.menus.get(nombre_de_plato);
    }
	
	public boolean crearMenu(String nombre_de_plato, boolean disponibilidad, String bebida, int precios, Plato2 plato) {
		if(!existeMenu(nombre_de_plato)) {
			Menu2 menu = new Menu2(nombre_de_plato, disponibilidad, bebida, precios, plato);
			this.menus.put(nombre_de_plato, menu);
			return true;
		}else {
			return false;
		}
	}
	public String consultaMenu() {
		String resultado = "Nombre\tDisponibilidad\tBebida\tPrecio\tPlato\n";
		for(String nombre_de_plato : this.menus.keySet()) {
			resultado += this.menus.get(nombre_de_plato);
		}
		return resultado;
	}
			
	public String editarMenu(String nombre_de_plato, boolean disponibilidad, String bebida, int precios, Plato2 platos) {
			if(existeMenu(nombre_de_plato)) {
				Menu2 actualizadoMenu = new Menu2(nombre_de_plato,disponibilidad,bebida,precios,platos);
				menus.put(nombre_de_plato, actualizadoMenu);
				return("menu editado");
			}else {
				return("no hay un menu valido para editar");
			}
		
	}
	
    public boolean agregarPlato(Plato2 plato) {
        if (this.platos.containsKey(plato.getId())) {
            return false;
        }
        else {
            this.platos.put(plato.getId(), plato);
            return true;
        }
    }
}
