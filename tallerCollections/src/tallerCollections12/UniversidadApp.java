package tallerCollections12;

public class UniversidadApp {

	  public static void main(String[] args) {
	        RegistroEstudiantes registro = new RegistroEstudiantes();

	        // Agregar estudiantes
	        registro.agregarEstudiante("Carlos Pérez");
	        registro.agregarEstudiante("Ana Gómez");
	        registro.agregarEstudiante("Luis Fernández");
	        registro.agregarEstudiante("Beatriz Ramírez");

	        // Mostrar la lista ordenada
	        registro.mostrarEstudiantes();

	        // Obtener primer y último estudiante
	        registro.primerEstudiante();
	        registro.ultimoEstudiante();
	    }
}

  
