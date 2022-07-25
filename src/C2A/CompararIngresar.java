package C2A;

import java.util.Scanner;

public class CompararIngresar {
    public static void main(String args[]) {

        //Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un mensaje.
        String nombre1 = "Greg";
        String nombre2 = "Greg";
        if (nombre1 == nombre2) {
            System.out.println("Cadenas de texto iguales");
        } else {
            System.out.println("Cadenas de texto diferentes");
        }

        //Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales. Informar el resultado obtenido.
        Integer valor1 = 6;
        Integer valor2 = 60598;
        int comparar;
        if (valor1.equals(valor2)) {
            System.out.println("Son iguales");
        } else {
            comparar = valor1.compareTo(valor2);
            if (comparar > 0)
                System.out.println("Valor1 es mayor que valor2");
            else
                System.out.println("Valor2 es mayor que valor1");
        }

        //Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en una tercera: tus iniciales.
        Scanner scanner;
        scanner = new Scanner(System.in);
        String nombre;
        String apellido;
        char inicialNombre;
        char inicialApellido;
        System.out.println("Ingresa tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingresa tu apellido");
        apellido = scanner.nextLine();
        inicialNombre = nombre.charAt(0);
        inicialApellido = apellido.charAt(0);
        System.out.println("Tus iniciales son: " + inicialNombre + inicialApellido);
    }
}
