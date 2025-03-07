package tallerCollections5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEjemplo {
	public static void main(String[] args) {
        // HashMap: No garantiza orden
        Map<Integer, String> productosHashMap = new HashMap<>();
        productosHashMap.put(3, "Laptop");
        productosHashMap.put(1, "Teclado");
        productosHashMap.put(2, "Mouse");

        // LinkedHashMap: Mantiene el orden de inserción
        Map<Integer, String> productosLinkedHashMap = new LinkedHashMap<>();
        productosLinkedHashMap.put(3, "Laptop");
        productosLinkedHashMap.put(1, "Teclado");
        productosLinkedHashMap.put(2, "Mouse");

        // TreeMap: Ordena los elementos por clave
        Map<Integer, String> productosTreeMap = new TreeMap<>();
        productosTreeMap.put(3, "Laptop");
        productosTreeMap.put(1, "Teclado");
        productosTreeMap.put(2, "Mouse");

        // Imprimir los mapas
        System.out.println("HashMap (Sin orden garantizado): " + productosHashMap);
        System.out.println("LinkedHashMap (Orden de inserción): " + productosLinkedHashMap);
        System.out.println("TreeMap (Ordenado por clave): " + productosTreeMap);
    }

}
/*Diferencias entre HashMap, LinkedHashMap y TreeMap:
HashMap:

No garantiza ningún orden de los elementos.
Es más rápido en operaciones de inserción, búsqueda y eliminación.
Útil cuando el orden no es importante y se necesita eficiencia.
LinkedHashMap:

Mantiene los elementos en el orden en que fueron insertados.
Es un poco más lento que HashMap debido a la gestión del orden.
Útil cuando se necesita mantener el orden de inserción.
TreeMap:

Ordena automáticamente los elementos según la clave.
Es más lento que HashMap y LinkedHashMap, ya que usa un árbol rojo-negro.
Útil cuando se necesita acceder a los elementos en orden ascendente o realizar operaciones de rango sobre claves.*/

