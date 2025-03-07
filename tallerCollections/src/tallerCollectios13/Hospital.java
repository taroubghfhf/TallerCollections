package tallerCollectios13;

import java.util.PriorityQueue;

//Clase de gestión de pacientes con PriorityQueue
public class Hospital {
	private PriorityQueue<Paciente> colaPacientes;

	public Hospital() {
	   this.colaPacientes = new PriorityQueue<>(new ComparadorPaciente());
	}

	// Ingresar un paciente en la cola
	public void ingresarPaciente(String nombre, int gravedad) {
	   Paciente paciente = new Paciente(nombre, gravedad);
	   colaPacientes.add(paciente);
	   System.out.println("Paciente ingresado: " + paciente);
	}

	// Atender al paciente con mayor prioridad
	public void atenderPaciente() {
	   if (!colaPacientes.isEmpty()) {
	       System.out.println("Atendiendo a: " + colaPacientes.poll());
	   } else {
	       System.out.println("No hay pacientes en espera.");
	   }
	}

	// Mostrar la lista de pacientes en espera
	public void mostrarPacientes() {
	   System.out.println("Pacientes en espera: " + colaPacientes);
	}
}