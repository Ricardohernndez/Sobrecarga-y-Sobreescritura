package Sobrecarga;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int EnteroA, EnteroB;
        double doubleA, doubleB;
        Scanner entrada = new Scanner(System.in);

        ClaseHija Double = new ClaseHija();
        ClasePadre Entero = new ClasePadre();

        System.out.println("Ingresar la operación para sumar enteros: ");
        System.out.println("Ingresa el primer valor");
        EnteroA = entrada.nextInt();
        System.out.println("Ingresa el segundo valor");
        EnteroB = entrada.nextInt();
        Entero.sumar(EnteroA,EnteroB);

        System.out.println("\nIngresar la operación para sumar double: ");
        System.out.println("Ingresa el primer valor");
        doubleA = entrada.nextDouble();
        System.out.println("Ingresa el segundo valor");
        doubleB = entrada.nextDouble();
        Double.sumar(doubleA,doubleB);




    }

}
