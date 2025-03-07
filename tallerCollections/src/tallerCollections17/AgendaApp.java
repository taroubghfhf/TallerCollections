package tallerCollections17;

//Clase principal para probar la implementación
public class AgendaApp {

	 public static void main(String[] args) {
	     AgendaEventos agenda = new AgendaEventos();

	     // Agregar eventos con fechas (Formato: YYYY-MM-DD)
	     agenda.agregarEvento("2025-03-10", "Conferencia de Tecnología");
	     agenda.agregarEvento("2025-02-25", "Reunión de equipo");
	     agenda.agregarEvento("2025-04-05", "Lanzamiento de producto");

	     // Mostrar eventos en orden cronológico
	     agenda.mostrarEventos();

	     // Obtener el evento más próximo
	     agenda.eventoMasProximo();
	 }

}