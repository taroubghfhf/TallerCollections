package tallerCollections7;

import java.util.LinkedList;
import java.util.Queue;

public class Banco {

    private LinkedList<String> colaClientes;

    public Banco() {
        this.colaClientes = new LinkedList<>();
    }

    // Agregar un cliente al final de la cola (turno normal)
    public void agregarCliente(String nombre) {
        colaClientes.addLast(nombre);
        System.out.println("Cliente agregado a la cola: " + nombre);
    }

    // Atender al primer cliente en la cola
    public void atenderCliente() {
        if (!colaClientes.isEmpty()) {
            System.out.println("Atendiendo a: " + colaClientes.removeFirst());
        } else {
            System.out.println("No hay clientes en la cola.");
        }
    }

    // Insertar un cliente con urgencia al inicio de la cola
    public void agregarClienteUrgente(String nombre) {
        colaClientes.addFirst(nombre);
        System.out.println("Cliente urgente agregado al inicio: " + nombre);
    }

    // Mostrar la cola de clientes
    public void mostrarCola() {
        System.out.println("Clientes en espera: " + colaClientes);
    }
}