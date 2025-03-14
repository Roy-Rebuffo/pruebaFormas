package pruebaformas;

import java.util.Scanner;

public class PruebaFormas {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce el tamaño del cuadrado: ");
        int tamanoCuad = dato.nextInt();

        //Cuadrado
        for (int i = 0; i < tamanoCuad; i++) {
            for (int j = 0; j < tamanoCuad; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Cuadrado vacio
        System.out.print("Introduce el tamaño del cuadrado vacio: ");
        int tamanoCuadVac = dato.nextInt();
        for (int i = 0; i < tamanoCuadVac; i++) {
            for (int j = 0; j < 10; j++) {   
            }
            System.out.println(" * ");
            
        }

        System.out.print("Introduce el tamaño del triangulo: ");
        int tamanoTri = dato.nextInt();
        //Triangulo
        for (int i = 1; i <= tamanoTri; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(); // Move to the next line after each row
        }
        System.out.println("");

    }

}
