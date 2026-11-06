/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drax;

/**
 *
 * @author AZULE
 */
import java.util.Stack;


public class Pila {
    Nodo primeroDeLaPila;

    // Método para apilar (Push)
    public void apilar(Object nuevoObjeto) {
        Nodo nuevoNodo = new Nodo(nuevoObjeto);

        nuevoNodo.siguiente = primeroDeLaPila;

        primeroDeLaPila = nuevoNodo;

    }

    // Método combinado para sacar y ver primero (Pop)
    public Object sacar() {
        if (primeroDeLaPila == null) return null;

        Object dato = primeroDeLaPila.contenido;

        primeroDeLaPila = primeroDeLaPila.siguiente;

        return dato;

    }
    public boolean estaVacia() {
        return primeroDeLaPila == null;
    }
}