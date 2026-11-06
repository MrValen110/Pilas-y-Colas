/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nebula;

/**
 *
 * @author AZULE
 */
public class Nodo {
    Object contenido; 
    Nodo siguiente;

    // Constructor
    public Nodo(Object contenido) {
        this.contenido = contenido;
        this.siguiente = null;
    }
}
