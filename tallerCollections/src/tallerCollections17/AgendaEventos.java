package tallerCollections17;

import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
	

    private TreeMap<String, String> eventos;

    public AgendaEventos() {
        this.eventos = new TreeMap<>();
    }

    // Agregar un evento con su fecha
    public void agregarEvento(String fecha, String evento) {
        eventos.put(fecha, evento);
        System.out.println("Evento agregado: " + fecha + " - " + evento);
    }

    // Mostrar todos los eventos en orden cronológico
    public void mostrarEventos() {
        System.out.println("\nAgenda de Eventos:");
        for (Map.Entry<String, String> entry : eventos.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Obtener el evento más próximo
    public void eventoMasProximo() {
        if (!eventos.isEmpty()) {
            Map.Entry<String, String> eventoProximo = eventos.firstEntry();
            System.out.println("\nEvento más próximo: " + eventoProximo.getKey() + " - " + eventoProximo.getValue());
        } else {
            System.out.println("\nNo hay eventos en la agenda.");
        }
    }
}