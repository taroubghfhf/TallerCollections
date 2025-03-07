package tallerCollectios13;

import java.util.Comparator;
import java.util.PriorityQueue;


//Comparador para ordenar por nivel de gravedad (de mayor a menor)
public class ComparadorPaciente implements Comparator<Paciente> {

	 @Override
	 public int compare(Paciente p1, Paciente p2) {
	     return Integer.compare(p2.getGravedad(), p1.getGravedad()); // Orden descendente
	 }
}