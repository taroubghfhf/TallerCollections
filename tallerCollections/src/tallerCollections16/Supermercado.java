package tallerCollections16;

import java.util.LinkedHashMap;
import java.util.Map;

public class Supermercado {

	private LinkedHashMap<String, Double> carrito;

    public Supermercado() {
        this.carrito = new LinkedHashMap<>();
    }

    // Agregar un producto al carrito
    public void agregarProducto(String producto, double precio) {
        carrito.put(producto, precio); // Si el producto ya existe, actualiza su precio
        System.out.println("Producto agregado: " + producto + " - $" + precio);
    }

    // Mostrar los productos en orden de escaneo
    public void mostrarCarrito() {
        System.out.println("\nCarrito de compras:");
        for (Map.Entry<String, Double> entry : carrito.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }

    // Calcular el total de la compra
    public double calcularTotal() {
        double total = 0;
        for (double precio : carrito.values()) {
            total += precio;
        }
        return total;
    }
}