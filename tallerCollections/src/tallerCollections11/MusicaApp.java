package tallerCollections11;

import java.util.Scanner;

public class MusicaApp {

    public static void main(String[] args) {
        FavoritoMusica favoritos = new FavoritoMusica();
        Scanner scanner = new Scanner(System.in);

        // Agregar canciones a favoritos
        favoritos.agregarCancion("Bohemian Rhapsody - Queen");
        favoritos.agregarCancion("Shape of You - Ed Sheeran");
        favoritos.agregarCancion("Imagine - John Lennon");

        // Intentar agregar una canción repetida
        favoritos.agregarCancion("Shape of You - Ed Sheeran");

        // Mostrar canciones favoritas
        favoritos.mostrarFavoritos();

        // Eliminar una canción
        System.out.print("Ingrese el nombre de la canción a eliminar: ");
        String cancionEliminar = scanner.nextLine();
        favoritos.eliminarCancion(cancionEliminar);

        // Mostrar lista actualizada
        favoritos.mostrarFavoritos();

        scanner.close();
    }
}