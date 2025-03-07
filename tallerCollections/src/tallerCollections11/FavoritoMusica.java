package tallerCollections11;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class FavoritoMusica {

    private LinkedHashSet<String> cancionesFavoritas;

    public FavoritoMusica() {
        this.cancionesFavoritas = new LinkedHashSet<>();
    }

    // Agregar una canción a favoritos
    public void agregarCancion(String cancion) {
        if (cancionesFavoritas.add(cancion)) {
            System.out.println("Canción añadida a favoritos: " + cancion);
        } else {
            System.out.println("La canción ya está en favoritos: " + cancion);
        }
    }

    // Eliminar una canción de favoritos
    public void eliminarCancion(String cancion) {
        if (cancionesFavoritas.remove(cancion)) {
            System.out.println("Canción eliminada de favoritos: " + cancion);
        } else {
            System.out.println("La canción no está en la lista de favoritos.");
        }
    }

    // Mostrar las canciones favoritas en orden de inserción
    public void mostrarFavoritos() {
        System.out.println("Canciones favoritas: " + cancionesFavoritas);
    }

}
