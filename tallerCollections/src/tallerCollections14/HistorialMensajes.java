package tallerCollections14;

import java.util.ArrayDeque;
import java.util.Deque;

public class HistorialMensajes {

	 private static final int LIMITE_HISTORIAL = 10;
	    private Deque<String> historial;

	    public HistorialMensajes() {
	        this.historial = new ArrayDeque<>();
	    }

	    // Agregar un nuevo mensaje al historial
	    public void enviarMensaje(String mensaje) {
	        if (historial.size() == LIMITE_HISTORIAL) {
	            historial.pollFirst(); // Elimina el mensaje más antiguo si se alcanza el límite
	        }
	        historial.addLast(mensaje);
	        System.out.println("Mensaje enviado: " + mensaje);
	    }

	    // Mostrar los últimos mensajes enviados
	    public void mostrarHistorial() {
	        System.out.println("Últimos mensajes enviados:");
	        for (String mensaje : historial) {
	            System.out.println("- " + mensaje);
	        }
	    }
}