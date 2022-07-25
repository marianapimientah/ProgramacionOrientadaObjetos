package C2A;

import java.util.Scanner;

public class Ejercitacion {
    //EJERCICIO UNO
//        public static boolean esPrimo(int num){
//            if(num % 2 == 0){
//                return true;
//            }
//            else{
//                return false;
//            }
//        }
//
//        public static void main(String args[]){
//            Scanner scanner = new Scanner(System.in);
//            int num;
//            System.out.println("Ingrese un numero (Entero): ");
//            num = scanner.nextInt();
//            System.out.println("El numero es par?: " + esPrimo(num));
//        }

    //EJERCICIO DOS
        public static int maximoEntreTresNumeros(int num1, int num2, int num3){
            int max = num1;
            if((num1 > num2) & (num1 > num3)){
                max = num1;
            } else if ((num2 > num1) & (num2 > num3)) {
                max = num2;
            } else if ((num3 > num1) & (num3 > num2)) {
                max = num3;
            }
            return max;
        }

        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese primer numero (Entero): ");
            int num1 = scanner.nextInt();
            System.out.println("Ingrese segundo numero (Entero): ");
            int num2 = scanner.nextInt();
            System.out.println("Ingrese tercer numero (Entero): ");
            int num3 = scanner.nextInt();
            System.out.println("El numero maximo es: " + maximoEntreTresNumeros(num1,num2,num3));
        }
}

