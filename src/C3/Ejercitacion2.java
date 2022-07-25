package C3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercitacion2 {
    public static void main(String args[]) {
        System.out.println("BIENVENIDOS. ESTA FUNCION PERMITE PRECISAR CUANTA COMIDA NECESITA TU PERRITO");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Cual es el nombre de tu perrito?");
        String nombrePerro = scanner.nextLine();
        System.out.println("Cual es la cantidad de comida que come tu perrito? (Kilogramos)");
        int cantidadComida = scanner.nextInt();

        double sumaC = 0;
        for (int i = 1; i <= i; i++) {
            System.out.println("Ingrese el peso del paquete " + i);
            double pesoPaquete = scanner.nextDouble();
            sumaC = (sumaC + pesoPaquete);
            if (sumaC >= cantidadComida){
                System.out.println(nombrePerro + " precisa " + i + " paquetes");
                break;
            }
        }
    }
}

