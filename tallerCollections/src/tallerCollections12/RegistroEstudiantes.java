package tallerCollections12;

import java.util.TreeSet;

public class RegistroEstudiantes {

	 private TreeSet<String> estudiantes;

	    public RegistroEstudiantes() {
	        this.estudiantes = new TreeSet<>();
	    }

	    // Agregar un estudiante a la lista
	    public void agregarEstudiante(String nombre) {
	        if (estudiantes.add(nombre)) {
	            System.out.println("Estudiante agregado: " + nombre);
	        } else {
	            System.out.println("El estudiante ya está registrado: " + nombre);
	        }
	    }

	    // Mostrar la lista de estudiantes en orden alfabético
	    public void mostrarEstudiantes() {
	        System.out.println("Lista de estudiantes: " + estudiantes);
	    }

	    // Obtener el primer estudiante (alfabéticamente)
	    public void primerEstudiante() {
	        if (!estudiantes.isEmpty()) {
	            System.out.println("Primer estudiante: " + estudiantes.first());
	        } else {
	            System.out.println("No hay estudiantes registrados.");
	        }
	    }

	    // Obtener el último estudiante (alfabéticamente)
	    public void ultimoEstudiante() {
	        if (!estudiantes.isEmpty()) {
	            System.out.println("Último estudiante: " + estudiantes.last());
	        } else {
	            System.out.println("No hay estudiantes registrados.");
	        }
	    }
}
