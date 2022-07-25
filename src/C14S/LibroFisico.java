package C14S;

import java.util.Scanner;

public class LibroFisico extends Libro{
    //atributos
    //constructor

    public LibroFisico(String titulo, Integer codigo, Double precioLista, Double precioPromocion) {
        super(titulo, codigo, precioLista, precioPromocion);
    }

    //metodos


    @Override
    public Double comprimir() {
        return null;
    }

    @Override
    public Double vender() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese tarjeta: ");
        String tarjeta = scanner.nextLine();
        return this.getPrecioLista() * 0.9;
    }
}
