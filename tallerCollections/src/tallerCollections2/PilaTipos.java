package tallerCollections2;
import java.util.Stack;
public class PilaTipos {
	 
	private Stack<Object> pila;

	    public PilaTipos() {
	        this.pila = new Stack<>();
	    }

	    public boolean push(Object elemento) {
	        if (pila.isEmpty() || pila.peek().getClass().equals(elemento.getClass())) {
	            pila.push(elemento);
	            return true;
	        } else {
	            System.out.println("Error: No se puede insertar un elemento de tipo " + 
	                               elemento.getClass().getSimpleName() + 
	                               " en una pila con elementos de tipo " + 
	                               pila.peek().getClass().getSimpleName());
	            return false;
	        }
	    }

	    public Object pop() {
	        if (!pila.isEmpty()) {
	            return pila.pop();
	        }
	        return null;
	    }

	    public Object peek() {
	        return pila.isEmpty() ? null : pila.peek();
	    }

	    public boolean isEmpty() {
	        return pila.isEmpty();
	    }

	    public void mostrarPila() {
	        System.out.println("Contenido de la pila: " + pila);
	    }

	    public static void main(String[] args) {
	        PilaTipos pila = new PilaTipos();

	        pila.push(10);  // Se permite
	        pila.push(20);  // Se permite
	        pila.push("Hola");  // Error, no coincide con Integer

	        pila.pop();  // Quita 20
	        pila.push("Hola");  // Ahora sí se permite

	        pila.mostrarPila();  
	    }
}
