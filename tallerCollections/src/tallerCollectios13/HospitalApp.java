package tallerCollectios13;


//Clase principal para probar la implementación
public class HospitalApp {

	public static void main(String[] args) {
		 Hospital hospital = new Hospital();

		 // Ingresar pacientes con diferentes niveles de gravedad
		 hospital.ingresarPaciente("Juan Pérez", 3);
		 hospital.ingresarPaciente("María Gómez", 5);
		 hospital.ingresarPaciente("Carlos López", 2);
		 hospital.ingresarPaciente("Ana Martínez", 4);

		 // Mostrar lista de pacientes en espera
		 hospital.mostrarPacientes();

		 // Atender pacientes en orden de prioridad
		 hospital.atenderPaciente();
		 hospital.atenderPaciente();

		 // Mostrar lista actualizada
		 hospital.mostrarPacientes();
		}
}