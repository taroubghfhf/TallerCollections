package tallerCollections3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListaSinDuplicados {


	
	    public static void main(String[] args) {
	        Set<String> lista = new LinkedHashSet<>();

	        // Agregar elementos a la lista
	        lista.add("Manzana");
	        lista.add("Banana");
	        lista.add("Naranja");
	        lista.add("Uva");
	        lista.add("Manzana"); // No se agregará porque ya existe

	        // Imprimir elementos usando un iterador
	        System.out.println("Elementos de la lista:");
	        Iterator<String> iterador = lista.iterator();
	        while (iterador.hasNext()) {
	            System.out.println(iterador.next());
	        }
	    }
	}


