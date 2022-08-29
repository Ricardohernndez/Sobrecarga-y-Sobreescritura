package Sobrecarga;

public class ClaseHija extends ClasePadre {
    double sumaDouble;

    public void sumar(double doubleA, double doubleB){

        sumaDouble = doubleA + doubleB;
        System.out.println("La suma double es: " + sumaDouble);



    }

}
