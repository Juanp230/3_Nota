package unidad2.actividad3.pasoPorReferencia;

import unidad2.actividad4.Sobrecarga;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Funciona");

        Sobrecarga calc = new Sobrecarga();

        // Llamadas corregidas: pasar literales o variables inicializadas
        System.out.println(calc.sumar(3, 4));
        System.out.println(calc.sumar(3, 4));
        System.out.println(calc.sumar(3, (int) 2.5)); // convierte 2.5 a int (2) si necesita int
    }
}