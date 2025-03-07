package tallerCollections9;

import java.util.Stack;

public class NavegadorWeb {

    private Stack<String> historial;

    public NavegadorWeb() {
        this.historial = new Stack<>();
    }

    // Visitar una nueva página (se agrega a la pila)
    public void visitarPagina(String url) {
        historial.push(url);
        System.out.println("Página visitada: " + url);
    }

    // Retroceder a la página anterior (se elimina la última)
    public void retroceder() {
        if (!historial.isEmpty()) {
            String ultimaPagina = historial.pop();
            System.out.println("Retrocediendo desde: " + ultimaPagina);
        } else {
            System.out.println("No hay páginas previas en el historial.");
        }
    }

    // Mostrar el historial de navegación
    public void mostrarHistorial() {
        System.out.println("Historial de navegación: " + historial);
    }
}