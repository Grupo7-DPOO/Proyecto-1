package Principal;

import java.util.Scanner;
import Clases.Habitaciones;
import Clases.Usuario;
import Clases.Factura;
import Clases.Cliente;
import Clases.Reserva;
public class Principal {
	private Habitaciones habitaciones;
	private Usuario usuario;
    Scanner sc = new Scanner(System.in);
	int opcion = 0;
	Cliente cliente = null;
	Factura factura = null;
	Reserva reserva = null;
	
	do {
		System.out.println("Menú principal");
		System.out.println("1. Crear cliente");
		System.out.println("2. Consultar cliente");
		System.out.println("3. Crear factura");
		System.out.println("4. Consultar factura");
		System.out.println("5. Crear reserva");
		System.out.println("6. Cancelar reserva");
		System.out.println("7. Consultar reserva");
		System.out.println("8. Salir");
		System.out.print("Ingrese una opción: ");
		opcion = sc.nextInt();
		sc.nextLine(); 

		switch (opcion) {
			case 1:
				System.out.print("Ingrese el nombre del cliente: ");
				String nombre = sc.nextLine();
				System.out.print("Ingrese la fecha de nacimiento del cliente (dd/mm/aaaa): ");
				String nacimiento = sc.nextLine();
				System.out.print("Ingrese el ID del cliente: ");
				int id = sc.nextInt();
				sc.nextLine(); 
				System.out.print("Ingrese el correo electrónico del cliente: ");
				String correo = sc.nextLine();

				cliente = new Cliente(nombre, nacimiento, id, correo);
				cliente.crearCliente();
				break;
			case 2:
				if (cliente == null) {
					System.out.println("No se ha creado ningún cliente aún.");
					break;
				}
				System.out.print("Ingrese el ID del cliente a consultar: ");
				int idCliente = sc.nextInt();
				sc.nextLine(); 
				String resultado = cliente.consultarCliente(idCliente);
				System.out.println(resultado);
				break;
			case 3:
				System.out.print("Ingrese la fecha de la factura (dd/mm/aaaa): ");
				String fecha = sc.nextLine();
				System.out.print("Ingrese el ID de la factura: ");
				int id2 = sc.nextInt();
				sc.nextLine(); 
				System.out.print("Ingrese el nombre del cliente: ");
				String cliente = sc.nextLine();
				System.out.print("Ingrese el nombre del recepcionista: ");
				String recepcionista = sc.nextLine();

				factura = new Factura(fecha, id2, cliente, recepcionista);
				factura.crearFactura();
				break;
			case 4:
				if (factura == null) {
					System.out.println("No se ha creado ninguna factura aún.");
					break;
				}
				System.out.print("Ingrese el ID de la factura a consultar: ");
				int idFactura = sc.nextInt();
				sc.nextLine(); 
				String resultado2 = factura.consultarFactura(idFactura);
				System.out.println(resultado2);
				break;
			case 5:
				System.out.print("Ingrese la cantidad de personas: ");
				int cantidadDePersonas = sc.nextInt();
				sc.nextLine(); 
				System.out.print("Ingrese la fecha de llegada (dd/mm/aaaa): ");
				String fechaDeLlegada = sc.nextLine();
				System.out.print("Ingrese la hora de llegada (hh:mm): ");
				String horaDeLlegada = sc.nextLine();
				System.out.print("Ingrese la hora de salida (hh:mm): ");
				String horaDeSalida = sc.nextLine();
				System.out.print("¿Desea una cama para menores? (S/N): ");
				boolean camaParaMenores = sc.nextLine().equalsIgnoreCase("S");
				System.out.print("Ingrese la cantidad de menores: ");
				int cantidadDeMenores = sc.nextInt();
				sc.nextLine(); 
				System.out.print("Ingrese el ID de la reserva: ");
				int id3 = sc.nextInt();
				sc.nextLine(); 

				reserva = new Reserva(cantidadDePersonas, fechaDeLlegada, horaDeLlegada,
									  horaDeSalida, camaParaMenores, cantidadDeMenores, id3);
				reserva.crearReserva();
				break;
			case 6:
				if (reserva == null) {
					System.out.println("No se ha creado ninguna reserva aún.");
					break;
				}
				System.out.print("Ingrese el ID de la reserva a cancelar: ");
				int idReserva = sc.nextInt();
				sc.nextLine(); 
				reserva.cancelarReserva(idReserva);
				break;
			case 7:
				if (reserva == null) {
					System.out.println("No se ha creado ninguna reserva aún.");
					break;
				}
				System.out.print("Ingrese el ID de la reserva a consultar: ");
				int idReservaConsulta = sc.nextInt();
				sc.nextLine(); 
				String resultado3 = reserva.consultarReserva(idReservaConsulta);
				System.out.println(resultado3);
				break;
			case 8:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida, por favor intente de nuevo.");
		}
	} while (opcion != 3);
	sc.close();
}	
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
	
	private void crearUsuario(Scanner sc) {
		System.out.println("Ingrese se nombre de usuario: ");
		String login = sc.next();
		System.out.println("Ingrese su contraseña: ");
		String password = sc.next();
		boolean creado = this.usuario.crearUsuario(password, login);
		System.out.println((creado)?"Usuario creado":"Error: Usuario ya existe");
	}
	private void deshabilitarUsuario(Scanner sc) {
		System.out.println("Ingrese el usuario de la persona que desea deshabilitar: ");
		String login = sc.next();
		this.usuario.deshabilitarUsuario(login);;		
}

	public static void main(String[] args) {
		new Principal();
	}
}
