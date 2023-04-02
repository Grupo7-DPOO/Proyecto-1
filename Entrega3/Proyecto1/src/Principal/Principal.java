package Principal;

import java.util.Scanner;
import Clases.Habitaciones;

public class Principal {
	private Habitaciones habitaciones;
	
	
	private void crearHabitacion(Scanner sc) {
		System.out.println("Ingrese el número de habitación: ");
		int numero = sc.nextInt();
		System.out.println("Ingrese la tarifa de la habitación: ");
		int tarifa = sc.nextInt();
		System.out.println("Ingrese la ubicación de la habitación: ");
		String ubicacion = sc.next();
		System.out.println("¿La habitación tiene balcón?: ");
		boolean balcon = sc.nextBoolean();
		System.out.println("Ingrese el tipo de habitación: ");
		String tipo = sc.next();
		System.out.println("¿La habitación tiene vista?: ");
		boolean vista = sc.nextBoolean();
		System.out.println("¿La habitación tiene cocina?: ");
		boolean cocina = sc.nextBoolean();
		boolean creado = this.habitaciones.crearHabitacion(numero, tarifa, ubicacion, balcon, tipo, vista, cocina);
		System.out.println((creado)?"Habitación Creada":"Error: Habitación ya existe");		
	}
	
	private void consultarHabitaciones(Scanner sc) {
		System.out.println("Ingrese el número de habitación que desea consultar: ");
		int numero = sc.nextInt();
		this.habitaciones.consultarHabitacion(numero);		
	}
	
	private void editarHabitaciones(Scanner sc) {
		System.out.println("Ingrese el número de habitación que desea editar: ");
		int numero = sc.nextInt();
		System.out.println("Ingrese la tarifa de la habitación: ");
		int tarifa = sc.nextInt();
		System.out.println("Ingrese la ubicación de la habitación: ");
		String ubicacion = sc.next();
		System.out.println("¿La habitación tiene balcón?: ");
		boolean balcon = sc.nextBoolean();
		System.out.println("Ingrese el tipo de habitación: ");
		String tipo = sc.next();
		System.out.println("¿La habitación tiene vista?: ");
		boolean vista = sc.nextBoolean();
		System.out.println("¿La habitación tiene cocina?: ");
		boolean cocina = sc.nextBoolean();
		this.habitaciones.editarHabitacion(numero, tarifa, ubicacion, balcon, tipo, vista, cocina);		
	}
	
	private void consultarTarifa(Scanner sc) {
		System.out.println("Ingrese el número de habitación del que desea conocer la tarifa: ");
		int numero = sc.nextInt();
		this.habitaciones.consultarTarifa(numero);
	}

	public static void main(String[] args) {
		new Principal();
	}
}
