package tallerCollections6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Inventario {

	 private List<Producto> productos;

	    public Inventario() {
	        this.productos = new ArrayList<>();
	    }

	    // Agregar un nuevo producto
	    public void agregarProducto(Producto producto) {
	        productos.add(producto);
	        System.out.println("Producto agregado: " + producto);
	    }

	    // Eliminar un producto por código
	    public void eliminarProducto(String codigo) {
	        productos.removeIf(p -> p.getCodigo().equals(codigo));
	        System.out.println("Producto con código " + codigo + " eliminado.");
	    }

	    // Buscar un producto por código
	    public Producto buscarProducto(String codigo) {
	        Optional<Producto> producto = productos.stream()
	                                               .filter(p -> p.getCodigo().equals(codigo))
	                                               .findFirst();
	        return producto.orElse(null);
	    }

	    // Listar productos en orden alfabético por nombre
	    public void listarPorNombre() {
	        productos.stream()
	                 .sorted(Comparator.comparing(Producto::getNombre))
	                 .forEach(System.out::println);
	    }

	    // Listar productos en orden de precio ascendente
	    public void listarPorPrecio() {
	        productos.stream()
	                 .sorted(Comparator.comparingDouble(Producto::getPrecio))
	                 .forEach(System.out::println);
	    }
	}



   