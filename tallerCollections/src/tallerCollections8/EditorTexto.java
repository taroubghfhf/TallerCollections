package tallerCollections8;

import java.util.Vector;

public class EditorTexto {
	

    private  Vector<String> historialCambios;

    public EditorTexto() {
        this.historialCambios = new Vector<>();
    }

    // Agregar un nuevo cambio al historial
    public void agregarCambio(String cambio) {
        historialCambios.add(cambio);
        System.out.println("Cambio agregado: " + cambio);
    }

    // Deshacer el último cambio
    public void deshacerCambio() {
        if (!historialCambios.isEmpty()) {
            String ultimoCambio = historialCambios.remove(historialCambios.size() - 1);
            System.out.println("Deshacer: " + ultimoCambio);
        } else {
            System.out.println("No hay cambios para deshacer.");
        }
    }

    // Mostrar el historial de cambios
    public void mostrarHistorial() {
        System.out.println("Historial de cambios: " + historialCambios);
    }
}