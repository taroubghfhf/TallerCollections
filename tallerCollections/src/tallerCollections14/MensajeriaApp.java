package tallerCollections14;

//Clase principal para probar la implementación
public class MensajeriaApp {

		 public static void main(String[] args) {
		     HistorialMensajes chat = new HistorialMensajes();

		     // Enviar mensajes de prueba
		     for (int i = 1; i <= 12; i++) {
		         chat.enviarMensaje("Mensaje " + i);
		     }

		     // Mostrar los últimos 10 mensajes
		     chat.mostrarHistorial();
		 }
}