package tallerCollections10;

import java.util.HashSet;
import java.util.Scanner;

public class ControlAcceso {
	
	 private HashSet<String> empleadosAutorizados;

	    public ControlAcceso() {
	        this.empleadosAutorizados = new HashSet<>();
	    }

	    // Agregar un empleado autorizado
	    public void registrarEmpleado(String idEmpleado) {
	        if (empleadosAutorizados.add(idEmpleado)) {
	            System.out.println("Empleado registrado con éxito: " + idEmpleado);
	        } else {
	            System.out.println("El empleado ya estaba registrado: " + idEmpleado);
	        }
	    }

	    // Verificar si un empleado tiene acceso
	    public boolean verificarAcceso(String idEmpleado) {
	        if (empleadosAutorizados.contains(idEmpleado)) {
	            System.out.println("Acceso permitido para: " + idEmpleado);
	            return true;
	        } else {
	            System.out.println("Acceso denegado para: " + idEmpleado);
	            return false;
	        }
	    }

	    // Mostrar lista de empleados autorizados
	    public void mostrarEmpleados() {
	        System.out.println("Empleados autorizados: " + empleadosAutorizados);
	    }
}