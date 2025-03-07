package talerCollections15;

import java.util.HashMap;
import java.util.Map;

public class DirectorioTelefonico {

	 private Map<String, String> contactos;

	    public DirectorioTelefonico() {
	        this.contactos = new HashMap<>();
	    }

	    // Agregar un nuevo contacto
	    public void agregarContacto(String nombre, String telefono) {
	        contactos.put(nombre, telefono); // Si el nombre ya existe, actualiza el número
	        System.out.println("Contacto agregado: " + nombre + " -> " + telefono);
	    }

	    // Buscar un número de teléfono por nombre
	    public String buscarContacto(String nombre) {
	        return contactos.getOrDefault(nombre, "Contacto no encontrado");
	    }

	    // Eliminar un contacto
	    public void eliminarContacto(String nombre) {
	        if (contactos.remove(nombre) != null) {
	            System.out.println("Contacto eliminado: " + nombre);
	        } else {
	            System.out.println("El contacto no existe.");
	        }
	    }

	    // Mostrar todos los contactos
	    public void mostrarContactos() {
	        System.out.println("Lista de contactos:");
	        for (Map.Entry<String, String> entry : contactos.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	    }
}