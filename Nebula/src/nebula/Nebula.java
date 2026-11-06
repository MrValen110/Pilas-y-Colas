/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nebula;

/**
 *
 * @author AZULE
 */
// Clase Nebula (Funciona como Cola utilizando dos Pilas internamente)
public class Nebula {
    private Pila pilaEntrada;
    private Pila pilaSalida;

    // Constructor
    public Nebula() {
        pilaEntrada = new Pila();
        pilaSalida = new Pila();
    }

    // Método enfilar (O(1))
    public void enfilar(Object obj) {
        pilaEntrada.apilar(obj);
    }

    // Método sacar (respeta orden FIFO usando las dos pilas)
    public Object sacar() {
        if (pilaSalida.estaVacia()) {
            while (!pilaEntrada.estaVacia()) {
                pilaSalida.apilar(pilaEntrada.sacar());
            }
        }
        return pilaSalida.sacar();
    }

    // Método main para probar el funcionamiento de forma independiente
    public static void main(String[] args) {
        Nebula cola = new Nebula();

        // Probamos enfilando datos genéricos (ej. Cadenas de texto)
        cola.enfilar("Dato A");
        cola.enfilar("Dato B");
        cola.enfilar("Dato C");

        // Los sacamos y mostramos (debe salir en orden FIFO: A, luego B, luego C)
        System.out.println("Sacando: " + cola.sacar()); // Dato A
        System.out.println("Sacando: " + cola.sacar()); // Dato B

        // Agregamos más elementos para verificar el comportamiento mixto
        cola.enfilar("Dato D");

        System.out.println("Sacando: " + cola.sacar()); // Dato C
        System.out.println("Sacando: " + cola.sacar()); // Dato D
    }
}