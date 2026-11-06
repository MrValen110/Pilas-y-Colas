/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boveda;

/**
 *
 * @author AZULE
 */
import java.util.Stack;

public class Boveda {

    public static void ordenarPila(Stack<Integer> gemas) {
        Stack<Integer> auxiliar = new Stack<>();

        while (!gemas.isEmpty()) {
            int temp = gemas.pop();

            while (!auxiliar.isEmpty() && auxiliar.peek() > temp) {
                gemas.push(auxiliar.pop());
            }

            auxiliar.push(temp);
        }

        while (!auxiliar.isEmpty()) {
            gemas.push(auxiliar.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> gemas = new Stack<>();
        gemas.push(10);
        gemas.push(50);
        gemas.push(30);
        gemas.push(20);

        System.out.println("Pila original: " + gemas);

        ordenarPila(gemas);

        System.out.println("Pila ordenada (mayor en la cima): " + gemas);
    }
}