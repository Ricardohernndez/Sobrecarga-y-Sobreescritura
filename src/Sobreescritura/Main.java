package Sobreescritura;

public class Main {

    public static void main(String[] args) {

        ClaseHija resta = new ClaseHija();
        ClasePadre suma = new ClasePadre();

        System.out.println("Ingresar la operación a restar");
        resta.PedirDatos();
        resta.MostrarResultado();
        System.out.println("la resta es: " + resta.resultado);

        System.out.println("\nIngresar la operación a sumar");
        suma.PedirDatos();
        suma.MostrarResultado();
        System.out.println("la suma es: " + suma.resultado);


    }
}
