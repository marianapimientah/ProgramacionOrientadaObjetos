package C5S;

public class Program {
    public static void main(String[] args) {
        Cupcake cupcakeDeChocolate = new Cupcake("C", "chocolate", "chocolate", false);
        cupcakeDeChocolate.getSabor();
        System.out.println("El sabor de su cupcake es: "+cupcakeDeChocolate.getSabor());

        Cupcake cupcakeDeVainilla = new Cupcake("G", "vainilla", "frambuesa", true);
        System.out.println("El sabor de su cupcake es: "+cupcakeDeVainilla.getSabor());

        cupcakeDeChocolate.setearPrecio(13);
        System.out.println("valor cupcake chocolate: "+cupcakeDeChocolate.getPrecio());
        System.out.println("valor cupcake vainilla: "+cupcakeDeVainilla.getPrecio());
    }
}
