package tallerCollections7;

public class BancoApp {

	    public static void main(String[] args) {
	        Banco banco = new Banco();

	        // Agregar clientes normales
	        banco.agregarCliente("Carlos");
	        banco.agregarCliente("Ana");
	        banco.agregarCliente("Luis");

	        // Mostrar la cola
	        banco.mostrarCola();

	        // Agregar un cliente con urgencia
	        banco.agregarClienteUrgente("María");

	        // Mostrar la cola nuevamente
	        banco.mostrarCola();

	        // Atender a los clientes
	        banco.atenderCliente();
	        banco.atenderCliente();
	        banco.mostrarCola();
	    }
	}
