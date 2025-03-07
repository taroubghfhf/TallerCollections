package tallerCollections1;

import java.util.Objects;
import java.util.TreeSet;

public class Producto implements Comparable<Producto>  {

	private String nombre;
	private String codigo;
	private float precio;
	
	public Producto(String nombre, String codigo, float precio){
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public float getPrecio() {
		return precio;
	}
	@Override
	public int compareTo(Producto otro) {
		return this.codigo.compareTo(otro.codigo);
	}
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) 
        	return false;
        Producto producto = (Producto) obj;
        return Objects.equals(codigo, producto.codigo);
	}
	 public int hashCode() {
	        return Objects.hash(codigo);
	    }

	    @Override
	    public String toString() {
	        return "Producto{codigo='" + codigo + "', nombre='" + nombre + "', precio=" + precio + "}";
	    }
	
}

