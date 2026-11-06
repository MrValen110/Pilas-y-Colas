/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package drax;

/**
 *
 * @author AZULE
 */
public class Drax {

    public static String buscarYExtraer(Pila armas, String objetivo) {
        Pila auxiliar = new Pila();
        String armaEncontrada = null;

        Object armaActual = armas.sacar();
        while (armaActual != null) {
            if (armaActual.equals(objetivo)) {
                armaEncontrada = (String) armaActual;
                break; 
            } else {
                auxiliar.apilar(armaActual);
            }
            armaActual = armas.sacar();
        }

        Object armaAux = auxiliar.sacar();
        while (armaAux != null) {
            armas.apilar(armaAux);
            armaAux = auxiliar.sacar();
        }

        return armaEncontrada;
    }
    public static void main(String[] args) {
        // Creamos la pila principal de armas para Drax
        Pila armasDeDrax = new Pila();

        // Apilamos las armas (El último en entrar queda ARRIBA del todo)
        armasDeDrax.apilar("Hacha de Batalla");
        armasDeDrax.apilar("Lanza Kree");
        armasDeDrax.apilar("Dagas de Vibranium"); // <--- El objetivo en el medio
        armasDeDrax.apilar("Bláster Láser");
        armasDeDrax.apilar("Cuchillo de Caza");   // <--- Queda arriba 

        System.out.println("=== SIMULACIÓN INICIADA ===");
        System.out.println("Buscando las 'Dagas de Vibranium' en la pila...");

        // Búsqueda
        String armaRescatada = buscarYExtraer(armasDeDrax, "Dagas de Vibranium");

        System.out.println("\n[RESULTADO DE LA BÚSQUEDA]");
        System.out.println("Arma extraída con éxito: " + armaRescatada);
        
        System.out.println("\n[VERIFICACIÓN DEL RESTO DE LA PILA]");
        System.out.println("Drax revisa las armas que quedaron (deben mantener el orden original):");
        
        // Vaciamos la pila final en la consola para demostrar que el orden no se destruyó
        Object armaEnPila = armasDeDrax.sacar();
        int contador = 1;
        while (armaEnPila != null) {
            System.out.println("Posición " + contador + " (desde arriba): " + armaEnPila);
            contador++;
            armaEnPila = armasDeDrax.sacar();
        }
    }
    
}
