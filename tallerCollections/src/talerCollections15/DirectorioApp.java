package talerCollections15;

// Clase principal para probar la implementación
public class DirectorioApp {


	    public static void main(String[] args) {
	        DirectorioTelefonico directorio = new DirectorioTelefonico();

	        // Agregar contactos
	        directorio.agregarContacto("Juan Pérez", "3123456789");
	        directorio.agregarContacto("María Gómez", "3159876543");
	        directorio.agregarContacto("Carlos López", "3001234567");

	        // Buscar contacto
	        System.out.println("Número de María Gómez: " + directorio.buscarContacto("María Gómez"));

	        // Mostrar todos los contactos
	        directorio.mostrarContactos();

	        // Eliminar un contacto
	        directorio.eliminarContacto("Juan Pérez");

	        // Mostrar la lista actualizada
	        directorio.mostrarContactos();
	    }
}