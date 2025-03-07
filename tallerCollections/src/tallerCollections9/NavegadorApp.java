package tallerCollections9;

public class NavegadorApp {

	 public static void main(String[] args) {
	        NavegadorWeb navegador = new NavegadorWeb();

	        // Visitar páginas
	        navegador.visitarPagina("https://google.com");
	        navegador.visitarPagina("https://github.com");
	        navegador.visitarPagina("https://stackoverflow.com");

	        // Mostrar historial
	        navegador.mostrarHistorial();

	        // Retroceder en la navegación
	        navegador.retroceder();
	        navegador.retroceder();

	        // Mostrar historial actualizado
	        navegador.mostrarHistorial();
	 }
}