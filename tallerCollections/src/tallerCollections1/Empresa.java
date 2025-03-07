package tallerCollections1;

import java.util.TreeSet;

public class Empresa {
	
	private TreeSet<Producto> productos;
	
	public Empresa(){
		
		this.productos = new TreeSet<>();
		
	}

	public void agregarProducto(Producto producto) {
     productos.add(producto);
	}
	public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    
    public static void main (String[] args) {
    	Empresa  empresa = new Empresa();
  
    	empresa.agregarProducto(new Producto("Vasos de cristal","001",9000));
    	empresa.agregarProducto(new Producto("Vajilla orona","002",78000));
    	empresa.agregarProducto(new Producto("cuchara","003",5000));
    	empresa.agregarProducto(new Producto("Juego de ollas ","004",100000));
    	
    	System.out.println("lista de productos: ");
    	empresa.mostrarProductos();
    	
    	String codigoBuscado = "003";
        Producto encontrado = empresa.buscarProductoPorCodigo(codigoBuscado);
        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado);
        } else {
            System.out.println("Producto con código " + codigoBuscado + " no encontrado.");
        }
    }
    
}
