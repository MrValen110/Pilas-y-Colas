/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escudos;

/**
 *
 * @author AZULE
 */
public class Cola {
    Nodo primeroEnLaCola;
    Nodo ultimoEnLaCola;

    // Insertar al final (Enfilar)
    public void enfilar(Object nuevoObjeto) {
        Nodo nuevoNodo = new Nodo(nuevoObjeto);

        if (primeroEnLaCola == null) {

            primeroEnLaCola = nuevoNodo;

        } else {
            ultimoEnLaCola.siguiente = nuevoNodo;

        }
        ultimoEnLaCola = nuevoNodo;

    }

    // Atender / Eliminar del principio (Desenfilar)
    public Object sacar() {
        if (primeroEnLaCola == null) return null;

        Object dato = primeroEnLaCola.contenido;

        primeroEnLaCola = primeroEnLaCola.siguiente;

        if (primeroEnLaCola == null) ultimoEnLaCola = null;
 // Si quedó vacía
        return dato;

    }
}