package tallerCollections16;


// Clase principal para probar la implementación
public class SupermercadoApp {



	    public static void main(String[] args) {
	        Supermercado compra = new Supermercado();

	        // Agregar productos en el orden escaneado
	        compra.agregarProducto("Leche", 4.50);
	        compra.agregarProducto("Pan", 2.00);
	        compra.agregarProducto("Huevos", 6.75);
	        compra.agregarProducto("Cereal", 5.25);

	        // Mostrar carrito
	        compra.mostrarCarrito();

	        // Calcular total
	        System.out.println("\nTotal a pagar: $" + compra.calcularTotal());
	    }
}
