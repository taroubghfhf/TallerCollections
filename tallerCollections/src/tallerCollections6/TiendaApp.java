package tallerCollections6;

public class TiendaApp {
	 public static void main(String[] args) {
	        Inventario inventario = new Inventario();

	        // Agregando productos
	        inventario.agregarProducto(new Producto("P001", "Laptop", 1500.0));
	        inventario.agregarProducto(new Producto("P002", "Mouse", 25.0));
	        inventario.agregarProducto(new Producto("P003", "Teclado", 45.0));

	        // Buscar un producto
	        System.out.println("\nBuscando producto con código P002:");
	        System.out.println(inventario.buscarProducto("P002"));

	        // Listar productos ordenados por nombre
	        System.out.println("\nInventario ordenado por nombre:");
	        inventario.listarPorNombre();

	        // Listar productos ordenados por precio
	        System.out.println("\nInventario ordenado por precio:");
	        inventario.listarPorPrecio();

	        // Eliminar un producto
	        inventario.eliminarProducto("P002");

	        // Listar nuevamente después de eliminar
	        System.out.println("\nInventario actualizado:");
	        inventario.listarPorNombre();
	    }
	}

   
