package tallerCollectios13;


import java.util.PriorityQueue;
import java.util.Comparator;


//Clase Paciente con nombre y nivel de gravedad
public class Paciente {
	 private String nombre;
	    private int gravedad; // Entre mayor sea el número, más urgente es la atención

	    public Paciente(String nombre, int gravedad) {
	        this.nombre = nombre;
	        this.gravedad = gravedad;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getGravedad() {
	        return gravedad;
	    }

	    @Override
	    public String toString() {
	        return nombre + " (Gravedad: " + gravedad + ")";
	    }
}