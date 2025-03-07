package tallerCollections6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Producto {

	 private String codigo;
	    private String nombre;
	    private double precio;

	    public Producto(String codigo, String nombre, double precio) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public String getCodigo() {
	        return codigo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    @Override
	    public String toString() {
	        return "Producto{" + "codigo='" + codigo + "', nombre='" + nombre + "', precio=" + precio + "}";
	    }
	}




   


