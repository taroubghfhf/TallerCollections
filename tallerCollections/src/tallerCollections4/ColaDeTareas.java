package tallerCollections4;

import java.util.PriorityQueue;
import java.util.Queue;

public class ColaDeTareas {

	public static void main(String[] args) {

        Queue<Tarea> colaDeTareas = new PriorityQueue<>();

        // Agregar tareas a la cola
        colaDeTareas.add(new Tarea("Revisar correo", 3));
        colaDeTareas.add(new Tarea("Atender reunión", 1));
        colaDeTareas.add(new Tarea("Enviar informe", 2));

        // Procesar las tareas según su prioridad
        System.out.println("Procesando tareas en orden de prioridad:");
        while (!colaDeTareas.isEmpty()) {
            System.out.println(colaDeTareas.poll()); // Extrae y muestra la tarea con mayor prioridad
        }

	}

}
