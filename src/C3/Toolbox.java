package C3;

import java.util.Scanner;

public class Toolbox {
    public static void sumarDosNumerosyDevolverResultado() {
        System.out.println("BIENVENIDOS A LA CALCULADORA DE DH. ESTA CALCULADORA PERMITE SUMAR DOS NUMEROS ENTEROS.");
        Scanner scanner = new Scanner(System.in);
        int numeroUno;
        int numeroDos;
        System.out.println("Ingrese el primer numero (debe ser entero): ");
        numeroUno = scanner.nextInt();
        System.out.println("Ingrese el segundo numero (debe ser entero): ");
        numeroDos = scanner.nextInt();

        int resultadoSuma = numeroUno + numeroDos;
        System.out.println("La suma de los valores ingresados es: " + resultadoSuma);
    }

    public static void determinarSiNumeroIngresadoEsPrimo() {
        System.out.println("BIENVENIDOS. ESTA FUNCION PERMITE AVERIGUAR SI UN NUMERO ES PRIMO O NO");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero (debe ser entero): ");
        int numero = scanner.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < numero; i++) {
            int restoDivision = numero % i;
            if (restoDivision == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println("El numero ingresado es primo");
        } else {
            System.out.println("El numero ingresado NO es primo");
        }
    }
}
