package C4A;

import java.util.Scanner;

public class BancoDigital {
    public static void main(String[] args) {
        TarjetaDebito tarjetaMariana = new TarjetaDebito("Mariana Pimienta", "23-05-2027", 44565415);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mariana, ingresa el valor que quieres sumar en tu cuenta");
        double dinero = scanner.nextDouble();


        tarjetaMariana.setSaldo(dinero);
        double cuantaPlataTieneMarianaAhora = tarjetaMariana.getSaldo();
        System.out.println("Mariana tiene: " + cuantaPlataTieneMarianaAhora);
    }
}
