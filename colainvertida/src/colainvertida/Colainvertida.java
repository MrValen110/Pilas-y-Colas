/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colainvertida;

/**
 *
 * @author AZULE
 */
public class Colainvertida {

    static class Nodo {
        Object dato;
        Nodo siguiente;

        Nodo(Object soltamosALosPerros) {
            dato = soltamosALosPerros;
        }
    }

    static class Cola {
        Nodo primero, ultimo;

        boolean estaVacia() { return primero == null; }

        void enfilar(Object soltamosALosPerros) {
            Nodo nuevo = new Nodo(soltamosALosPerros);
            if (estaVacia()) primero = nuevo;
            else ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }

        Object sacar() {
            if (estaVacia()) return null;
            Object soltamosALosPerros = primero.dato;
            primero = primero.siguiente;
            if (primero == null) ultimo = null;
            return soltamosALosPerros;
        }
    }

    static class Pila {
        Nodo cima;

        boolean estaVacia() { return cima == null; }

        void apilar(Object soltamosALosPerros) {
            Nodo nuevo = new Nodo(soltamosALosPerros);
            nuevo.siguiente = cima;
            cima = nuevo;
        }

        Object sacar() {
            if (estaVacia()) return null;
            Object soltamosALosPerros = cima.dato;
            cima = cima.siguiente;
            return soltamosALosPerros;
        }
    }

    static void invertirCola(Cola cola) {
        Pila temp = new Pila();

        while (!cola.estaVacia())
            temp.apilar(cola.sacar());

        while (!temp.estaVacia())
            cola.enfilar(temp.sacar());
    }

    public static void main(String[] args) {
        Cola cola = new Cola();

        for (int i = 10; i <= 40; i += 10)
            cola.enfilar(i);

        invertirCola(cola);

        while (!cola.estaVacia())
            System.out.println(cola.sacar());
    }
}