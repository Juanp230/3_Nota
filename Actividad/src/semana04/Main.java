package semana04;

public class Main {

    public static void main(String[] args) {
        System.out.println("Funciona");

        Sobrecarga calc = new Sobrecarga();

        System.out.println(calc.sumar(numA:3, numB:4));
        System.out.println(calc.sumar(numA:3, numB:4, numC:5));
        System.out.println(calc.sumar(numA:3, numB:2.5));


    }
}