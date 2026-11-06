/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicainfinita;

/**
 *
 * @author AZULE
 */
class Nodo {
    Object contenido;
    Nodo siguiente;

    public Nodo(Object contenido) {
        this.contenido = contenido;
        this.siguiente = null;
    }
}

class Cola {
    Nodo primeroEnLaCola;
    Nodo ultimoEnLaCola;

    public void enfilar(Object nuevoObjeto) {
        Nodo nuevoNodo = new Nodo(nuevoObjeto);

        if (primeroEnLaCola == null) {
            primeroEnLaCola = nuevoNodo;
        } else {
            ultimoEnLaCola.siguiente = nuevoNodo;
        }

        ultimoEnLaCola = nuevoNodo;
    }

    public Object sacar() {
        if (primeroEnLaCola == null) return null;

        Object dato = primeroEnLaCola.contenido;
        primeroEnLaCola = primeroEnLaCola.siguiente;

        if (primeroEnLaCola == null) {
            ultimoEnLaCola = null;
        }

        return dato;
    }
}

public class MusicaInfinita {

    public static void reproducirSiguiente(Cola playlist) {

        if (playlist.primeroEnLaCola == null) {
            System.out.println("La lista esta vacia");
            return;
        }

        while (true) {
            Object yoSoyInvisible = playlist.sacar();

            System.out.println("Reproduciendo: " + yoSoyInvisible);

            playlist.enfilar(yoSoyInvisible);
        }
    }

    public static void main(String[] args) {

        Cola playlist = new Cola();

        playlist.enfilar("Cancion 1");
        playlist.enfilar("Cancion 2");
        playlist.enfilar("Cancion 3");

        reproducirSiguiente(playlist);
    }
}