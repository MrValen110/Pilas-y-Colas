/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escudos;

    
public class Escudos {

    public static void distribucionEscudos(Cola sectores) {
        Object sectorAtendido = sectores.sacar();
        Sector sA = (Sector) sectorAtendido;
        sA.energiafaltante = sA.energiafaltante - 10;
        if (sA.energiafaltante > 0) { 
            sectores.enfilar(sectorAtendido);
        } else {
            System.out.println("El sector " + sA.nombre + " ha sido completamente restaurado");
        }
    }
    
    public static void main(String[] args) {
        int c = 0;
        Cola sectores = new Cola();
        Sector Delantero = new Sector("Delantero", 25);
        Sector Trasero = new Sector("Trasero", 10);
        Sector Izquierdo = new Sector("Izquierdo", 5);
        Sector Derecho = new Sector("Derecho", 15);
        sectores.enfilar(Delantero);
        sectores.enfilar(Trasero);
        sectores.enfilar(Izquierdo);
        sectores.enfilar(Derecho);
        while (sectores.primeroEnLaCola != null) {
            distribucionEscudos(sectores);
        }
    }
    
}
