package tallerCollections10;

import java.util.Scanner;

public class EdificioApp {
	
	 public static void main(String[] args) {
	        ControlAcceso control = new ControlAcceso();
	        Scanner scanner = new Scanner(System.in);

	        // Registrar empleados
	        control.registrarEmpleado("EMP001");
	        control.registrarEmpleado("EMP002");
	        control.registrarEmpleado("EMP003");

	        // Intentar registrar un duplicado
	        control.registrarEmpleado("EMP002");

	        // Verificar acceso
	        System.out.print("Ingrese ID para verificar acceso: ");
	        String id = scanner.nextLine();
	        control.verificarAcceso(id);

	        // Mostrar empleados autorizados
	        control.mostrarEmpleados();

	        scanner.close();
	    }
	}