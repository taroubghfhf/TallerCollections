package tallerCollections8;

public class EditorApp {

	  public static void main(String[] args) {
	        EditorTexto editor = new EditorTexto();

	        // Agregando cambios al editor
	        editor.agregarCambio("Agregada línea 1");
	        editor.agregarCambio("Modificada línea 2");
	        editor.agregarCambio("Eliminada línea 3");

	        // Mostrar historial
	        editor.mostrarHistorial();

	        // Deshacer cambios
	        editor.deshacerCambio();
	        editor.deshacerCambio();

	        // Mostrar historial actualizado
	        editor.mostrarHistorial();
	    }

}
  