package Sobreescritura;

import java.util.Scanner;

public class ClasePadre {
    int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos(){
        System.out.print("Ingresa el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.print("Ingresa el segundo valor: ");
        valor2 = entrada.nextInt();
    }

    public void MostrarResultado(){
        resultado = valor1 + valor2;
    }

}
